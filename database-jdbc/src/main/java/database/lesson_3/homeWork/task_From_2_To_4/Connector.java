package database.lesson_3.homeWork.task_From_2_To_4;

import java.sql.*;
import java.util.List;

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
            throw new RuntimeException(e);
        }
    }
}
