package org.example.lesson_21.home_work_21.task_2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
Есть TreeSet<Student>. Заполните его списком студентов. Если получили исключение, вспомните про интерфейс Comparable или Comparator
 */
public class StudentList {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        addStudents(students);
        System.out.println(students);
    }

    //cool!
    public static void addStudents(Set<Student> students) {
        Scanner scan = new Scanner(System.in);
        int id = 1;
        boolean addMore = true;
        while (addMore) {
            Student student = new Student();
            System.out.println("Please, type name of the student");
            student.setName(scan.next());
            System.out.println("Please, type surname of the student");
            student.setSurname(scan.next());
            student.setId(id);
            students.add(student);
            System.out.println("Do you want to add someone else? Type for YES = 1 or NO = 0");
            if (scan.nextInt() == 0) {
                addMore = false;
            }
            id++;
        }
    }
}
