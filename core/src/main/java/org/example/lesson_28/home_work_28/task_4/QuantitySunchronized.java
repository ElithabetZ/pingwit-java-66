package org.example.lesson_28.home_work_28.task_4;

public class QuantitySunchronized {

    public synchronized void writeContedWords(Quantity quantity, int count){
        quantity.setQuantity(quantity.getQuantity() + count);
    }
}
