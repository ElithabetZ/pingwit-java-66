package org.example.lesson_5.homeWork5;

import java.util.Arrays;

/*
При помощи двумерного массива вывести на экран таблицу умножения
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] multipTable = new int[10][10];//можно было дать возможность пользователю решить
        printMultiplicationTable(multipTable);
    }

    public static void printMultiplicationTable(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = j;
                System.out.println(i + " x " + j + " = " + array[i][j] * i + " ");
            }
            System.out.println();
        }
    }
}
