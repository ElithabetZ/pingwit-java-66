package org.example.lesson_28.home_work_28.task_4;

import java.util.Arrays;
import java.util.List;

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

        Quantity allWords = new Quantity();
        QuantitySunchronized quantitySunch = new QuantitySunchronized();
        List<String> resources = Arrays.asList(FILE_PATH_1, FILE_PATH_2);
        countWords(resources, allWords, quantitySunch);
    }

    public static void countWords(List<String> resources, Quantity allWords, QuantitySunchronized quantitySunch) {
        for (String path : resources) {
            CountWords countWords = new CountWords(path, allWords, quantitySunch);
            Thread thread = new Thread(countWords);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("In " + resources.size() + " files there are " + allWords.getQuantity()+" words");
    }
}
