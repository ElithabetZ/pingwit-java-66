package org.example.lesson_29.point_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread());
            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);


        executorService.isShutdown();

    }
}
