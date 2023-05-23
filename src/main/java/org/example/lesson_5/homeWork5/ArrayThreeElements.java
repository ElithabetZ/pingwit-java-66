package org.example.lesson_5.homeWork5;

import java.util.Arrays;
import java.util.Scanner;

/*
Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран
 */
public class ArrayThreeElements {
    public static void main(String[] args) {
        int lenghtArray = 3;
        int[] arrayElements = new int[lenghtArray];
        int sumOfArray = fillArrayAndGetSum(arrayElements);
        Arrays.sort(arrayElements);
        System.out.println("Sum of numbers in array is " + sumOfArray);
        System.out.println("The biggest numbers in array is " + arrayElements[lenghtArray - 1]);
        System.out.println("The smallest number in array is " + arrayElements[0]);
    }

    public static int fillArrayAndGetSum(int[] array) {
        Scanner scan = new Scanner(System.in);
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter " + (i + 1) + " element of the array");
            array[i] = scan.nextInt();
            sumOfArray += array[i];
        }
        return sumOfArray;
    }

    ;
}
