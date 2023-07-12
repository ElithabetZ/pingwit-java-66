package org.example.lesson_18.point_3;

public class PairMain {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "Apple");

        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
}
