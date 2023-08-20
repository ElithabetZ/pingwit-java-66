package org.example.lesson_3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a & b;
        System.out.println(c);

        boolean d = a || b;
        System.out.println(d);

        System.out.println(!(a & b));
        System.out.println(true && (2>5));
    }
}
