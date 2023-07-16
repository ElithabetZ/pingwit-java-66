package org.example.lesson_18.home_work_18.task_2;

import java.util.Arrays;
//T желательно ограничиит только Car (extends)
public class Garage<T> {

    private T[] cars;
    private String owner;


    public Garage(T[] typeOfCar, String owner) {
        this.cars = typeOfCar;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + Arrays.toString(cars) +
                ", owner='" + owner + '\'' +
                '}';
    }
}
