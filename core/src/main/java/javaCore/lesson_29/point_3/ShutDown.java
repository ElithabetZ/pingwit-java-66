package javaCore.lesson_29.point_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDown {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new SummaryRunnable(1));
        executorService.submit(new SummaryRunnable(2));
        executorService.submit(new SummaryRunnable(3));
        executorService.submit(new SummaryRunnable(4));

        executorService.shutdownNow();

        System.out.println("The end");
    }
}
