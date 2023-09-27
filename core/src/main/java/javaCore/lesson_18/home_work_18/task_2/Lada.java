package javaCore.lesson_18.home_work_18.task_2;

public class Lada extends Car{

    private String name;
    private int year;

    public Lada(int year) {
        this.name = "Lada";
        this.year = year;
    }

    @Override
    public String toString() {
        return "Lada{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
