package org.example.lesson_15.point_3;

import java.util.Scanner;

public class TryCatchMultipleExample {
    public static void main(String[] args) {
        tryCatchNumberFormatException();
    }

    private static void tryCatchNumberFormatException() {
        Scanner scan = new Scanner(System.in);
        String next = scan.next();
        try {
            Integer number = Integer.valueOf(next);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format: " + next);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Catch " + next);
        }
    }
}
