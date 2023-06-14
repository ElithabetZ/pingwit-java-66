package org.example.lesson_10.home_work_10.task_1;

public class Main {
    public static void main(String[] args) {
        Vegetable[] vegetables = {
                new Tomato("tomato", 256, 52),
                new Cucumber("cucumber", 589, 32),
                new Tomato("tomato", 322, 45),
                new Cucumber("cucumber", 120, 12)
        };

        Salad salad = new Salad(vegetables);
        salad.makeSalad();
    }
}
