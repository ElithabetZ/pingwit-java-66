package database.lesson_3.homeWork.task_From_2_To_4;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class QueryManager {
    private String CREATETABLE = "CREATE TABLE %1$s (%2$s) ";//CREATE_TABLE_SQL
    private String INSERT = "INSERT INTO %1$s VALUES %2$s";//INSETR_SQL
    //файл должен быть в ресурсах. Но можно и просто константу. Или, например, какой-то отдельный класс - StudentQueries
    private static final String PATH_FINDSTUDENTSBYLESSON = "database-jdbc/src/main/java/database/lesson_3/homeWork/task_From_2_To_4/findStudentsByLesson.txt";

    public void createTable(String name, String query){
        CREATETABLE = String.format(CREATETABLE, name, query);//+!
        Connector connector = new Connector();
        connector.createTable(CREATETABLE, name);
    }

    public void insertQuery(String names, String values){
        INSERT = String.format(INSERT, names, values);
        Connector connector = new Connector();
        connector.insert(INSERT);
    }

    public List<Student> findStudentsByLesson(String lesson){
        try {
            File file = new File(PATH_FINDSTUDENTSBYLESSON);
            String findStudentsByLessonQuery = new String();
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);

            for (String line: lines) {
                findStudentsByLessonQuery += line + " ";
            }

            findStudentsByLessonQuery = String.format(findStudentsByLessonQuery, lesson);

            List<Student> students = new ArrayList<>();
            Connector connector = new Connector();
            students = connector.findStudents(findStudentsByLessonQuery, students);
            return students;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
