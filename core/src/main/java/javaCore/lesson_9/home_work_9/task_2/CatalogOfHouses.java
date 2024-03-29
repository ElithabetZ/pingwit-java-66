package javaCore.lesson_9.home_work_9.task_2;

import java.util.Arrays;

public class CatalogOfHouses {
    //House[] houses
    private TypeOfHouse[] houses;

    public CatalogOfHouses(TypeOfHouse[] houses)
    {
        this.houses = houses;
    }

    public TypeOfHouse[] getHouses()
    {
        return houses.clone();
    }

    @Override
    public String toString() {
        return "houses=" + Arrays.toString(houses);
    }
}
