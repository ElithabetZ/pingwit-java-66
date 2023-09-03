package org.example.lesson_28.home_work_28.task_2;

import java.util.Arrays;
import java.util.List;

/*
Есть магазин игрушек, в который несколько поставщиков (потоков) доставляют товар. Вам необходимо доставить в магазин игрушки
(например 100 от одного поставщика и 50 от другого и затем вывести на экран все игрушки, которые сейчас в магазине
 */
public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        ToySynchronized toySynchronized = new ToySynchronized();
        ToySynchronizedService service = new ToySynchronizedService(toySynchronized, warehouse, 1000);
        ToySynchronizedService service2 = new ToySynchronizedService(toySynchronized, warehouse, 50);
        Thread thread1 = new Thread(service);
        Thread thread2 = new Thread(service2);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(warehouse.getQuantity());
    }
}
