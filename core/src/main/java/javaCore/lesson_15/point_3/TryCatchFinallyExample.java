package javaCore.lesson_15.point_3;

import java.util.Scanner;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        example();
    }
    private static void example() {
        Scanner scan = new Scanner(System.in);
        String next = scan.next();
        try {
            Integer number = Integer.valueOf(next);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format: " + next);
        }
        finally {
            System.out.println("Block finally");
        }
    }
}
