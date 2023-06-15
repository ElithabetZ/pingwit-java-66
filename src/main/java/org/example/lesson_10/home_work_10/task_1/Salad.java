package org.example.lesson_10.home_work_10.task_1;

public class Salad {
    private Vegetable[] vegetables;
    //это не совсем поля класса. Это больше какие-то локальные переменные метода
    private double sumOfKalories;
    private double sumOfWeight;

    public Salad(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public void makeSalad() {
        for (int i = 0; i < vegetables.length; i++) {
            sumOfKalories += vegetables[i].getKalories();
            sumOfWeight += vegetables[i].getWeight();
        }
        System.out.println("Sum of kalories: " + sumOfKalories);
        System.out.println("Sum of weight: " + sumOfWeight);
    }
}
