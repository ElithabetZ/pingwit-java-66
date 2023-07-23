package org.example.lesson_20.point_1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(4, "A");
        treeMap.put(2, "A");
        treeMap.put(3, "A");

        System.out.println(treeMap);
    }
}
