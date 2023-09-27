package javaCore.lesson_17.home_work_17.task_1;

import java.io.Serial;
import java.io.Serializable;

public class Work implements Serializable {

    @Serial
    private static final long serialVersionUID = -1032472056860472334L;
    private String name;
    private int minWorkExsp;

    public Work(String name, int minWorkExsp) {
        this.name = name;
        this.minWorkExsp = minWorkExsp;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", minWorkExsp=" + minWorkExsp +
                '}';
    }
}
