package org.example.lesson_5.homeWork5;

import java.util.Arrays;

/*
Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
 */
//+
public class EvenNumbersFromArray {
    public static void main(String[] args) {
        int lenghtOfArray = 10;
        int[] array = createArray(lenghtOfArray);
        System.out.println(Arrays.toString(array));
        int[] arrayEven = getEvenArray(array, findLenghtOfEvenArray(array));
        System.out.println(Arrays.toString(arrayEven));

    }

    public static int[] createArray(int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
        return array;
    }

    public static int findLenghtOfEvenArray(int[] array) {
        int lenghtOfEvenArray = 0;
        if (array.length % 2 == 0) {
            lenghtOfEvenArray = (array.length / 2);
        } else {
            lenghtOfEvenArray = ((array.length / 2) + 1);
        }
        return lenghtOfEvenArray;
    }

    public static int[] getEvenArray(int[] array, int lenght) {
        int[] arrayEven = new int[lenght];
        for (int i = 0; i < array.length; i += 2) {
            arrayEven[i / 2] = array[i];
        }
        return arrayEven;
    }
}
