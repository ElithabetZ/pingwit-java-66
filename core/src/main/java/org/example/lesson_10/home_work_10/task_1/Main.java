package org.example.lesson_10.home_work_10.task_1;

public class Main {
    public static void main(String[] args) {
        Vegetable[] vegetables = {
            //Tomato и так понятно, что "tomato". Зачем еще String поле? Мы это обсуждали на прошлом занятии. Либо одно, либо 2 - е
                new Tomato("tomato", 256, 52),
                new Cucumber("cucumber", 589, 32),
                new Tomato("tomato", 322, 45),
                new Cucumber("cucumber", 120, 12)
        };

        Salad salad = new Salad(vegetables);
        salad.makeSalad();
    }
}
