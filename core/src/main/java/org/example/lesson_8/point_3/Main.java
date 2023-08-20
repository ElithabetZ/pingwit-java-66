package org.example.lesson_8.point_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Fruit.BANANA);
        System.out.println(Fruit.valueOf("BANANA"));



        Direction east = Direction.EAST;
        System.out.println(east);
        System.out.println(east.getShortCode());
        boolean equals = east.equals(Direction.NORTH);
        System.out.println(equals);
        boolean equals2 = east == Direction.EAST;
        System.out.println(equals2);
    }
}
