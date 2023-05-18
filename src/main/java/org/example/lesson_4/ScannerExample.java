package org.example.lesson_4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name...");
        String name = scan.next();

        System.out.println("How old are you?");
        byte age = scan.nextByte();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
    }
}
