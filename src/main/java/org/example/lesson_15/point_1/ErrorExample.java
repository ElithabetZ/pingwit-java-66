package org.example.lesson_15.point_1;

public class ErrorExample {

    public static void main(String[] args) {
        outOfMemoryError();
    }

    public static void outOfMemoryError(){
        int[] array = new int[Integer.MAX_VALUE];
    }
}
