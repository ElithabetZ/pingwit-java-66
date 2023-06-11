package org.example.lesson_9.point_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Mustang");
        print(car);
        Bicycle bicycle = new Bicycle("Aist");
        print(bicycle);
    }

    public static void print(Venicle venicle)
    {
        venicle.drive();
    }
}
