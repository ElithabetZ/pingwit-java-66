package org.example.lesson_8.home_work_8;

public record Box(String name, double weight) {

    //а разве этот метод в record под капотом уже не переопределен?
    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


