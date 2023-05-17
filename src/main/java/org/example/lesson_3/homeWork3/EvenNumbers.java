package org.example.lesson_3.homeWork3;
/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class EvenNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){

            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
