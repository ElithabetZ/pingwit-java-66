package org.example.lesson_30.point_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentLockExample {

    private int amount;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();


    public void doPaument(){
        try{
            System.out.println("Start payment");
            lock.lock();
            while (amount <= 0){
                condition.await();
            }
            System.out.println("Paument is closed");
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void init(){
        try{
            lock.lock();
            System.out.println("Init");
        } finally {
            lock.unlock();
        }
    }
}
