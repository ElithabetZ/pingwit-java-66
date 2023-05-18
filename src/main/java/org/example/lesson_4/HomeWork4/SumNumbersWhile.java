package org.example.lesson_4.HomeWork4;

import java.util.Scanner;

/*
Вычислить: 1+2+4+8+...+256
 */
public class SumNumbersWhile {
    public static void main(String[] args) {
        int limitPower = 8;
        int maxPower = getMaxPower(limitPower);
        printSum(maxPower, limitPower);
    }

    public static void printSum(int maxPower, int limitPower) {
        if (maxPower <= limitPower && maxPower > 0) {
            int sum = calculateSum(maxPower);
            System.out.println("Sum of numbers is " + sum);
        } else {
            System.out.println("Oppps... 500er500");
        }
    }

    public static int getMaxPower(int limitPower) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter power of two, but less then " + limitPower);
        int maxPower = scan.nextInt();
        return maxPower;
    }

    public static int calculateSum(int maxPower){
        int i = 1;
        int sum = 0;
        double maxNumber = Math.pow(2, maxPower);
        while (i <= maxNumber) {
            sum += i;
            i *= 2;
        }
        return sum;
    }

}
