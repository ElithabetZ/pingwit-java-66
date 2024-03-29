package javaCore.lesson_21.home_work_21.task_2;
//equals() and hashcode()?
public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int id;

    //а чего полное имя, а не просто Student?
    public int compareTo(Student student) {
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
