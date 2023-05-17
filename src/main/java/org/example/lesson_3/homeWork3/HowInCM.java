package org.example.lesson_3.homeWork3;
/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class HowInCM {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++){
            double inch = 2.54;
            double sum = i * inch;
            System.out.println(i + " inch in CM is " + sum);
        }
    }
}
