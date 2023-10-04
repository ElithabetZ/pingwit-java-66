package org.example.project_CountWords;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public class Main {
    private static final String FILE_PATH_1 = "core/src/main/resources/lesson_28/Example1.txt";
    private static final String FILE_PATH_2 = "core/src/main/resources/lesson_28/Example2.txt";

    public static void main(String[] args) {
        List<String> resources = Arrays.asList(FILE_PATH_1, FILE_PATH_2);
        countWords(resources);
    }

    public static void countWords(List<String> resources) {
        AtomicInteger count = new AtomicInteger();
        for (String path : resources) {
            CountWords countWords = new CountWords(path);
            Thread thread = new Thread(countWords);
            thread.start();
            try {
                thread.join();
                count.addAndGet(countWords.getQuantity().get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("In " + resources.size() + " files there are " + count + " words");
    }
}
