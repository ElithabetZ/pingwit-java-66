package org.example.lesson_13.home_work_13.task_2;

import java.util.Objects;

//+
public class Computer extends Product{
    private String processor;
    private int ram;
    public Computer(String name, double price, int quantity, String processor, int ram) {
        super(name, price, quantity);
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                '}';
    }
}
