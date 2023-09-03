package org.example.lesson_28.home_work_28.task_2;

public class ToySynchronizedService implements Runnable {

    private ToySynchronized toySynchronized;
    private final Warehouse warehouse;
    private final Integer quantity;

    public ToySynchronizedService(ToySynchronized toySynchronized, Warehouse warehouse, Integer quantity) {
        this.toySynchronized = toySynchronized;
        this.warehouse = warehouse;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        for (int i = 0; i < quantity; i++) {
            toySynchronized.addToy(warehouse);
        }
    }
}
