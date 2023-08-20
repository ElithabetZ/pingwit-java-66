package org.example.lesson_9.home_work_9.task_2;

public class Main {
    public static void main(String[] args) {

        TypeOfHouse[] houses = {
                new TypeOfHouse("urban high-rise building", 12, 300),
                new TypeOfHouse("country house", 18, 500)
        };

        CatalogOfHouses catalog = new CatalogOfHouses(houses);
        System.out.println(catalog);
    }
}
