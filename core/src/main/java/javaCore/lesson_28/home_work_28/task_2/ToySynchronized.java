package javaCore.lesson_28.home_work_28.task_2;

public class ToySynchronized {

    public synchronized void addToy(Warehouse warehouse){
        warehouse.addToy(new Toy("Toy"));
    }
}
