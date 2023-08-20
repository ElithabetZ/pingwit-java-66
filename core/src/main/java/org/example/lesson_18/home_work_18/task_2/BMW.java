package org.example.lesson_18.home_work_18.task_2;

public class BMW extends Car{

    private String name;
    private int year;

    public BMW(int year) {
        this.name = "BMW";
        this.year = year;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
