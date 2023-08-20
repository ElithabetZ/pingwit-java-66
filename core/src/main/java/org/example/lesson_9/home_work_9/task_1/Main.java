package org.example.lesson_9.home_work_9.task_1;
//ok
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        print(apple);
        Php php = new Php();
        print(php);
        Dell dell = new Dell();
        print(dell);
    }

    public static void print(Computer computer)
    {
        computer.turnOn();
        computer.turnOff();
        computer.reset();
    }
}
