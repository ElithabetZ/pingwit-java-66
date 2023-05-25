package org.example.lesson_5.homeWork5;

import java.util.Arrays;

/*
Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
 */
public class ArrayOddElement {
    public static void main(String[] args) {
        int[] array = {52, 32, 65, 45, 12, 2, 36, 25, 85};

        for(int i = 1; i < array.length; i+=2){
            array[i] = 0;
        }
        //пустая строка
        System.out.println(Arrays.toString(array));
    }
}
