package org.example.lesson_15.home_work_15.task_2;

import java.util.Scanner;

/*
Напишите программу, которая пытается разделить два числа (их вводит пользователь),
но перехватывает и обрабатывает исключение ArithmeticException,
которое будет выдано, если знаменатель равен нулю.
 */
public class DivisionZero {
    //ввод полтзователя тоже нужно в отдельный метод
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type numerator");
        int numerator = scan.nextInt();
        System.out.println("Type denominator");
        int denominator = scan.nextInt();
        division(numerator, denominator);
    }

    public static void division(int numerator, int denominator) {
        try {
            int division = numerator / denominator;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }
}
