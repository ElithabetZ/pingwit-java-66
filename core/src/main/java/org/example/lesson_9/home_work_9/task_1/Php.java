package org.example.lesson_9.home_work_9.task_1;

public class Php implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Php On");
    }

    @Override
    public void turnOff() {
        System.out.println("Php Off");
    }

    @Override
    public void reset() {
        System.out.println("Php reset");
    }
}
