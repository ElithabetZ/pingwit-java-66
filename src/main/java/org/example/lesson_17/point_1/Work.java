package org.example.lesson_17.point_1;

import java.io.Serial;
import java.io.Serializable;

public class Work implements Serializable {

    @Serial
    private static final long serialVersionUID = 3371139916375955530L;
    private String name;

    public Work(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                '}';
    }
}
