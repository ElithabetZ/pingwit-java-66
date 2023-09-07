package org.example.lesson_29.home_work.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
Написать программу, которая получает аргументом программы пути к файлам.
Программа должна посчитать кол-во слов в каждом файле по отдельности,
затем общее кол-во файлов и вывести на экран.
На каждый файл используйте отдельный поток для вычислений.

Сделать коллекцией пути к файлам и потом посчитать сколько в коллекции, сам подсчет я уже написала
 */
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
            //можно было попробовать создать через лямбу
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
