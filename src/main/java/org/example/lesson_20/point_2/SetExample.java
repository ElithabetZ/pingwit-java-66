package org.example.lesson_20.point_2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Piano> pianes = new HashSet<>();

        pianes.add(new Piano("YAMANA", "Black", true));
        pianes.add(new Piano("YAMANA", "Red", true));
        pianes.add(new Piano("YAMANA", "Yellow", false));

        for (Piano piane: pianes) {
            System.out.println(piane);
        }

    }
}
