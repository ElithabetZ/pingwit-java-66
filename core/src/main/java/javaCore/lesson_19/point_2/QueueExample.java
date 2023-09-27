package javaCore.lesson_19.point_2;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(9);
        integerQueue.add(2);
        integerQueue.add(4);

        System.out.println(integerQueue);
        int first = integerQueue.poll();
        System.out.println(first);
        int second = integerQueue.poll();
        System.out.println(second);
        int third = integerQueue.poll();
        System.out.println(third);
        System.out.println(integerQueue);


        Queue<Integer> llQueue = new LinkedList<>();
        List<Integer> llList = new LinkedList<>();
    }
}
