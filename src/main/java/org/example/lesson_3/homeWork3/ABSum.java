package org.example.lesson_3.homeWork3;
/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
//+
public class ABSum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        for (int i = 1; i <= b; i++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
