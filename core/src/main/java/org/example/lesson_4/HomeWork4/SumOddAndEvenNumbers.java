package org.example.lesson_4.HomeWork4;

import java.util.Scanner;

/*
Даны числа от 0 до 100 (числа пользователя)
 - Посчитать сумму четных и вывести на экран
 - Посчитать сумму нечетных и вывести на экран
 - Найти общую сумму всех чисел
 */
//очень круто, лишь пару комментов
public class SumOddAndEvenNumbers {
    public static void main(String[] args) {

        int startNumber = getStartNumber();
        int endNumber = getEndNumber();
        int startEven = 0;
        int startOdd = 0;
        //100 - в переменную
        if (startNumber < 100 && endNumber < 100) {
            if (startNumber > 0 && endNumber > 0) {
                if (startNumber % 2 == 0) {
                    startEven = startNumber;
                    startOdd = startNumber + 1;
                } else {
                    startEven = startNumber + 1;
                    startOdd = startNumber;
                }
                printSumOfNumbers(startEven, startOdd, endNumber);
            } else {
                System.out.println("Oppps... Only positive:)");
            }
        } else {
            System.out.println("Oppps... More than 100 :)");
        }
    }


    public static int getSumOfNumbers(int startNumber, int endNumber) {
        int sumNumbers = 0;
        while (startNumber <= endNumber) {
            sumNumbers += startNumber;
            startNumber += 2;
        }
        return sumNumbers;
    }

    public static void printSumOfNumbers(int startEven, int startOdd, int endNumber) {
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int sumAllNumbers = 0;

        sumEvenNumbers = getSumOfNumbers(startEven, endNumber);
        System.out.println("Sum of all even numbers from your range is " + sumEvenNumbers);
        sumOddNumbers = getSumOfNumbers(startOdd, endNumber);
        System.out.println("Sum of all odd numbers from your range is " + sumOddNumbers);
        sumAllNumbers = sumEvenNumbers + sumOddNumbers;
        System.out.println("Sum of all numbers from your range is " + sumAllNumbers);
    }
    //то же, что и в прошлом - один метод для 2-ч чисел
    public static int getStartNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, write some number from 0 to 100 ");
        int startNumber = scan.nextInt();
        return startNumber;
    }

    public static int getEndNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, write some number from 0 to 100 ");
        int endNumber = scan.nextInt();
        return endNumber;
    }
}
