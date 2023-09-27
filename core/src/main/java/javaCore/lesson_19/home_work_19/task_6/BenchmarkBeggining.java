package javaCore.lesson_19.home_work_19.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
//комменты такие же, как и в прошлом - неймино startAL и т.д
public class BenchmarkBeggining {

    public static void main(String[] args) {

        int iterations = 10000;//100000
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        while (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        long str1Finish = System.currentTimeMillis();
        long result1 = str1Finish - start;
        System.out.println("ArrayList: " + result1);


        long start1 = System.currentTimeMillis();
        while (!linkedList.isEmpty()) {
            linkedList.remove(0);
        }
        long str2Finish = System.currentTimeMillis();
        long result2 = str2Finish - start1;
        System.out.println("LinkedList: " + result2);
    }
}
