package org.example.lesson_20.point_2;

import java.util.Set;
import java.util.TreeSet;

public class TreeExample {

    public static void main(String[] args) {

        Set<Integer> ints = new TreeSet<>();
        ints.add(1);
        ints.add(2);
        ints.add(5);
        ints.add(3);
        System.out.println(ints);
    }
}
