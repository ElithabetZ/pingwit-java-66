package org.example.lesson_13.home_work_13.task_2;

import java.util.Objects;

public class Apple extends Product{
    //можно было цвет как enum сделать
    private String color;
    public Apple(String name, double price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple apple)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}
