package javaCore.lesson_22.home_work_22.task_2;

import java.util.Scanner;
import java.util.function.BinaryOperator;

/*
Используя интерфейс BinaryOperator написать лямбда-выражение, которое бы умножало одно целое число на другое
 */
//+
public class BinaryExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type the first integer number");
        int firstInt = scan.nextInt();
        System.out.println("Please, type the second integer number");
        int secondInt = scan.nextInt();
        BinaryOperator<Integer> multi = (x, y) -> x * y;
        System.out.println(multi.apply(firstInt, secondInt));
    }
}
