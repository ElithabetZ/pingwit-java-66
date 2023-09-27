package javaCore.lesson_28.home_work_28.task_3;

import java.util.List;
import java.util.Objects;

public class Uniwersity {
    List<Student> students;//private??

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uniwersity that)) return false;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

}
