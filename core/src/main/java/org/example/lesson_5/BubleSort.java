package org.example.lesson_5;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] arrayToSort = {9, 1, 2, 10, 15, 19};

        System.out.println(Arrays.toString(arrayToSort));

        boolean needToSort = true;
        while(needToSort) {
            needToSort = false;

            for(int i = 1; i<arrayToSort.length; i++){
                if(arrayToSort[i] < arrayToSort[i-1]) {
                    swap(arrayToSort, i, i-1);
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void swap(int[] arrayToSort, int current, int previous){
        int temp = arrayToSort[previous];
        arrayToSort[previous] = arrayToSort[current];
        arrayToSort[current] = temp;
    };
}
