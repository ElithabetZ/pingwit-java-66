package org.example.lesson_30.point_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Garage {

    private final List<Integer> cars = new ArrayList<>();
    private final ReentrantLock locker = new ReentrantLock();

    public void park(int number) {
        try {
            boolean isLocked = locker.tryLock(100, TimeUnit.MICROSECONDS);
            if (isLocked) {
                try {
                    cars.add(number);
                    System.out.println(number);
                } finally {
                    locker.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getCars() {
        return cars;
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Garage garage = new Garage();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                garage.park(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Result: " + garage.getCars().size());
    }
}
