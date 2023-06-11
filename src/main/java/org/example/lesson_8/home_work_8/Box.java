package org.example.lesson_8.home_work_8;

public record Box(String name, double weight) {

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


