package database.lesson_3.homeWork.task_From_2_To_4;

import java.sql.*;
import java.util.List;
/*
    ты молодчинка, что разделила querymanager и connector.
    Но теперь смотри: если у тебя появится новая сущность, то это все будет в коннекторе - например, findEmployees и т.д и т.п. А таких сущностей
    может быть триллион, образно)) Представляешь, что будет с этим классом?...
    Поэтому давай пременим все знания полиморфизма. Можно под каждую сущность создать свой интерфейс.
    interface Repository<T> {
        List<T> find(String query);
    }

    interface StudentRepository<Student> extends Repository {
        ...
    }

    class StudentRepositoryImpl implements StudentRepository {
        @Override
        ...
    }

    И затем можно в коннекторе добавить Repository. Аналогично и с QueryManager :)

    Именно такое разделение сейчас позволит тебе с легкостью расширять свое приложение и писать крутой код в будущем 😎
*/
    
public class Connector {

    private static final String URL = "jdbc:postgresql://localhost:5432/students";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "root";

    public void createTable(String query, String name) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement createTable = connection.createStatement();
            createTable.executeUpdate(query);
            System.out.println("Table " + name + " is added");
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(String query) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement createTable = connection.createStatement();
            int count = createTable.executeUpdate(query);
            System.out.println("Changed " + count + " times");
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //ты осуществляешь поиск и возвращаешь их. Зачем в параметрах List? Создавай в методе новый
    public List<Student> findStudents(String query, List<Student> students){
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement find = connection.createStatement();
            ResultSet result = find.executeQuery(query);

            while(result.next()){
                long id = result.getLong(1);
                String name = result.getString(2);
                int age = result.getInt(3);
                String course = result.getString(4);
                Student student = new Student(id, name, age, course);
                students.add(student);
            }
            connection.close();

            return students;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);//а давай так не будем делать? Я на занятии так пишу для быстроты, но и говорю, что так делать очень плохо
            //какие есть варианты? 
        }
    }
}
