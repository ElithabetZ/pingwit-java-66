package javaCore.lesson_5.homeWork5;

import java.util.Arrays;

/*
Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
 */
//+
public class InvertedOrder {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    //можно было инвертировать, проитерировшись лишь только до половины массива
    public static void swap(int[] array) {
        int i = 0;
        int j = (array.length - 1);
        while (j > i) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
