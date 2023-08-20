package org.example.lesson_10.home_work_10.task_2;

public class Monkey {
    private Fruit typeOfMonkey;//может фрукт? Обезьяна может уметь считать не только 1 фрукт, а несколько, а значит это не просто тип Fruit

    public Monkey(Fruit typeOfMonkey) {
        this.typeOfMonkey = typeOfMonkey;
    }

    public Fruit getTypeOfMonkey() {
        return typeOfMonkey;
    }
}
