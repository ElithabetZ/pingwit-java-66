package database.lesson_3.homeWork.task_From_2_To_4;

import java.util.List;

public class Main {
    private static String tableSubjectName = "subject";
    private static String tableSubject = "id serial primary key, name varchar(50), average_score integer";
    private static String tablesubject_id_student_idName = "subject_id_student_id";
    private static String tablesubject_id_student_id = "subject_id integer, student_id bigint, CONSTRAINT fk_subject_id FOREIGN KEY(subject_id) REFERENCES subject(id), " +
                    "CONSTRAINT fk_student_id FOREIGN KEY(student_id) REFERENCES student(id)";
    private static String insertSubjectNames = "subject(name, average_score)";
    private static String insertSubjectValues = "('Math', 75), ('Russian', 60), ('Geography', 50)";
    private static String insertsubject_id_student_idNames = "subject_id_student_id(subject_id, student_id)";
    private static String insertsubject_id_student_idValues = "(1,1),(1,2),(1,3),(2,4),(2,5),(2,6),(3,7),(3,6),(3,5),(3,1)";
    
    public static void main(String[] args) {
        QueryManager queryManager = new QueryManager();

        //это ты, конечно, интересно придумала. Можно было просто в базе создать)) 👍
        queryManager.createTable(tableSubjectName, tableSubject);
        queryManager.insertQuery(insertSubjectNames, insertSubjectValues);

        queryManager.createTable(tablesubject_id_student_idName, tablesubject_id_student_id);
        queryManager.insertQuery(insertsubject_id_student_idNames, insertsubject_id_student_idValues);

        List<Student> students = queryManager.findStudentsByLesson("Math");//find
        students.forEach(System.out::println);
    }
}
