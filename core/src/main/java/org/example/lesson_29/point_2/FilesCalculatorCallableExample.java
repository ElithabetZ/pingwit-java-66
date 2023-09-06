package org.example.lesson_29.point_2;

import org.example.lesson_29.point_1.FilesCalculatorCollable;

import java.util.concurrent.*;

public class FilesCalculatorCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String path = "core/src/main/java/org/example";

        FilesCalculatorCollable filesCalculatorCollable = new FilesCalculatorCollable(path);
        //Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(filesCalculatorCollable);

        Integer intRes = result.get();
        System.out.println(intRes);

        executorService.shutdown();
    }
}
