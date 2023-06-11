package org.example.lesson_9.home_work_9.task_1;

public class Apple implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Apple On");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple Off");
    }

    @Override
    public void reset() {
        System.out.println("Apple reset");
    }
}
