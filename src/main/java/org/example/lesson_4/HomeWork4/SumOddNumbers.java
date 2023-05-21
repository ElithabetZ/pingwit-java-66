package org.example.lesson_4.HomeWork4;

import java.util.Scanner;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99 (1, 99 - числа пользователя)
 */
public class SumOddNumbers {
    public static void main(String[] args) {
        int limit = 99;
        int startNumber = getStartNumber(limit);
        int endNumber = getEndNumber(limit);
        int sum = 0;
        printSumOfOddNumbers(startNumber, endNumber, limit, sum);
    }

    public static int getStartNumber(int limit){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type integer number you want to start with, but not negative and more than " + limit);
        int startNumber = scan.nextInt();
        return startNumber;
    }

    public static int getEndNumber(int limit){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type integer number you want to end with, but not negative and more than "+ limit);
        int endNumber = scan.nextInt();
        return endNumber;
    }

    public static void printSumOfOddNumbers(int startNumber, int endNumber, int limit, int sum){
        if (startNumber > 0 && endNumber > 0) {
            if (startNumber <= limit && endNumber <= limit) {
                if (startNumber % 2 != 0) {
                    while (startNumber <= endNumber) {
                        sum += startNumber;
                        startNumber += 2;
                    }
                    System.out.println(sum);
                } else {
                    startNumber += 1;
                    while (startNumber <= endNumber) {
                        sum += startNumber;
                        startNumber += 2;
                    }
                    System.out.println(sum);
                }
            } else {
                System.out.println("Oppps.... Numbers bigger than they should be :)");
            }
        } else {
            System.out.println("Oppps... Only positive numbers :)");
        }
    }
}
