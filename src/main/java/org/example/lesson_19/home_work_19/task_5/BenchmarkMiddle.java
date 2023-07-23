package org.example.lesson_19.home_work_19.task_5;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Есть ArrayList и LinkedList на 100К одинаковых элементов.
Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
Удалить нужно все элементы
 */
public class BenchmarkMiddle {
    public static void main(String[] args) {

        int iterations = 10000;
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add("a");
            linkedList.add("a");
        }

        long start = System.currentTimeMillis();
        while (!arrayList.isEmpty()) {
            arrayList.remove("a");
        }
        long str1Finish = System.currentTimeMillis();
        long result1 = str1Finish - start;
        System.out.println("ArrayList: " + result1);


        long start1 = System.currentTimeMillis();
        while (!linkedList.isEmpty()) {
            linkedList.remove( "a");
        }
        long str2Finish = System.currentTimeMillis();
        long result2 = str2Finish - start1;
        System.out.println("LinkedList: " + result2);
    }
}
