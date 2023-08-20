package org.example.lesson_15.point_2;

public class RuntimeExample {
    public static void main(String[] args) {

    }

    public static void arithmeticException() {
        int a = 10;
        int b = 0;
        int c = a / b;
    }

    public static void npe(){
        String s = null;
        s.toUpperCase();
    }
}
