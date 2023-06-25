package org.example.lesson_13.home_work_13.task_2;

import java.util.Objects;

public class Apple extends Product{
    private String color;
    public Apple(String name, double price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}
