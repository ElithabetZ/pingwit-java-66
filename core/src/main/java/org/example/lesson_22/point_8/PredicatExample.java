package org.example.lesson_22.point_8;

import java.util.function.Predicate;

public class PredicatExample {

    public static void main(String[] args) {
        Predicate<String> predicat = (val) -> val != null;
        System.out.println(predicat.test("null"));
    }
}
