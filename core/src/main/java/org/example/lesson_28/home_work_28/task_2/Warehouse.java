package org.example.lesson_28.home_work_28.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warehouse {

    private List<Toy> toys;
    private int quotity;

    public Warehouse() {
        this.toys = new ArrayList<>();
        this.quotity = 0;
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
        this.quotity += 1;
    }

    public int getQuantity(){
        return this.quotity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse warehouse)) return false;
        return quotity == warehouse.quotity && Objects.equals(toys, warehouse.toys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toys, quotity);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "toys=" + toys +
                ", quotity=" + quotity +
                '}';
    }
}
