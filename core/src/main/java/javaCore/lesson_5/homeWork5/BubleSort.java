package javaCore.lesson_5.homeWork5;

import java.util.Arrays;

/*
Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
Попробуйте сами написать и затем посмотрите реализацию
 */
public class BubleSort {
    public static void main(String[] args) {

        int[] array = {25, 5, 10, 6, 1, 23, 20, 45, 8, 7, 4, 9, 5, 6, 8};
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i);
                    needSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i - 1];
        array[i - 1] = temp;
    }


}
