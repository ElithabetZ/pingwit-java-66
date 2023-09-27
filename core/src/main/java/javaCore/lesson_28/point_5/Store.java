package javaCore.lesson_28.point_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Store {

    private int product = 0;

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product++;
        System.out.println("Producer put 1 product" + LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        System.out.println("Products in the store " + product);
        notify();
    }

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("Buyer bought 1 product" + LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        System.out.println("Products in the store " + product);
        notify();
    }
}
