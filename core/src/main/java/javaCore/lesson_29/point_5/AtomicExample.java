package javaCore.lesson_29.point_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicExample {

    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                store.eat();
            }
        };

        int threads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(threads);
        for (int i = 0; i < threads; i++) {
            executorService.submit(runnable);
        }
        //executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println(store.getHotDogStatistics());
        executorService.shutdown();
    }
}
