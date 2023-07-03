package org.example.lesson_15.home_work_15.task_1;

import java.util.Scanner;

/*
Создайте метод, который принимает целочисленный параметр и
возвращает логическое значение, указывающее, является ли число
простым или нет. Если параметр меньше или равен нулю, создайте исключение
IllegalArgumentException.
 */
//+
public class IsSimple {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number");
        int number = scan.nextInt();
        System.out.println(isPrime(number));
    }
//почитай еще про single return point
    public static boolean isPrime(int number) {
        if (number <= 1) {
            throw new IllegalArgumentException("Number must be greater than one");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
