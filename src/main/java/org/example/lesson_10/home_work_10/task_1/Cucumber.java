package org.example.lesson_10.home_work_10.task_1;

public class Cucumber extends Vegetable{
    private double kalories;
    private double weight;

    public Cucumber(String name, double kalories, double weight)
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
