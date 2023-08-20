package org.example.lesson_3.homeWork3;

/*
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
public class OddAndEvenSum {
    public static void main(String[] args) {
        int sumAll = 0;
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i <= 100; i++) {
            sumAll += i;//можно в цикле не считать, а после просто сложить sumOdd и sumEven

            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of all numbers from 0 to 100 is " + sumAll);
        System.out.println("Sum of all even numbers from 0 to 100 is " + sumEven);
        System.out.println("Suma of all odd numbers from 0 to 100 is " + sumOdd);
    }
}
