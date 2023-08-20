package org.example.lesson_3.homeWork3;
/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа
 */
//+
public class AmebaPractise {
    public static void main(String[] args) {

        int amebaCount = 2;

        for (int i = 3; i <= 24; i += 3) {
            System.out.println("Time " + i + " Ameba =" + amebaCount);
            amebaCount *=2;
        }
    }
}
