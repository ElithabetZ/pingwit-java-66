package org.example.lesson_21.home_work_21.task_2;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int id;

    public int compareTo(org.example.lesson_21.home_work_21.task_2.Student student) {
        int nameResult = this.name.compareTo(student.name);
        if (nameResult != 0) {
            return nameResult;
        }
        int surnameResult = this.surname.compareTo(student.surname);
        if (surnameResult != 0) {
            return surnameResult;
        }
        return this.id - student.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name=" + name +
                " surname=" + surname +
                " id=" + id;
    }
}
