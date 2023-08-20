package org.example.lesson_9.home_work_9.task_3;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", 1986);
        audi.drive();
        audi.motorOff();
        audi.motorOn();
        audi.drive();
        audi.downshift();
        audi.upshift();
        audi.drive();
    }
}
