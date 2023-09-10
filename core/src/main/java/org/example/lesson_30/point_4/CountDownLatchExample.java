package org.example.lesson_30.point_4;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
}

class Runner implements Runnable{

    private final String name;
    private final CountDownLatch countDownLatch;

    public Runner(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run(){

    }
}
