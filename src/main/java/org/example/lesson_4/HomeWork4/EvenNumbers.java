package org.example.lesson_4.HomeWork4;
/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно (2, 100 - числа пользователя)
 */

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int startNumber = getStartNumber();
        int endNumber = getEndNumber();
        printRangeOfNumbers(startNumber, endNumber);
    }

    public static int getStartNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type integer number you want to start with, but not negative");
        int startNumber = scan.nextInt();
        return startNumber;
    }

    ;

    public static int getEndNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type integer number you want to end with, but not negative");
        int endNumber = scan.nextInt();
        return endNumber;
    }

    ;

    public static void printRangeOfNumbers(int startNumer, int endNumber) {
        if (startNumer > 0 && endNumber > 0) {
            if (startNumer < endNumber) {
                if (startNumer % 2 == 0) {
                    do {
                        System.out.println(startNumer);
                        startNumer += 2;
                    } while (startNumer <= endNumber);
                } else {
                    startNumer += 1;
                    while (startNumer <= endNumber) {
                        System.out.println(startNumer);
                        startNumer += 2;
                    }
                }
            } else {
                System.out.println("Oppppps... First number must be smaller than the second :)");
            }
        } else {
            System.out.println("Oppppps... Only positive numbers :)");
        }

    }
}
