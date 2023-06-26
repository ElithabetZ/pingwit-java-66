package org.example.lesson_13.home_work_13.task_2;

import java.util.Objects;

public class Coffee extends Product{
    //можно было тоже как enum
    private String type;
    public Coffee(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                '}';
    }
}
