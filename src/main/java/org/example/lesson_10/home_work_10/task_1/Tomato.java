package org.example.lesson_10.home_work_10.task_1;

public class Tomato extends Vegetable {

    private double kalories;
    private double weight;

    public Tomato(String name, double kalories, double weight)
    {
        this.kalories = kalories;
        this.weight = weight;
    }
    @Override
    public double getKalories() {
        return kalories;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
