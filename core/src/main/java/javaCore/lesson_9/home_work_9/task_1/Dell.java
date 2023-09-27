package javaCore.lesson_9.home_work_9.task_1;

public class Dell implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Dell On");
    }

    @Override
    public void turnOff() {
        System.out.println("Dell Off");
    }

    @Override
    public void reset() {
        System.out.println("Dell reset");
    }
}
