package org.example.lesson_10;

import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = {4,6,1,9,2,10};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        int pivot = findPartilion(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr,pivot+1, end);

    }
    private static int findPartilion(int[] arr, int start, int end)
    {
        int pivot = arr[end];

        int pivotIndex = start;
        for(int i = start; i<end; i++)
        {
            if(arr[i] <= pivot)
            {
                swap(arr,i,pivotIndex);
                pivotIndex++;
            }
        }

        swap(arr,end,pivotIndex);
        return pivotIndex;
    }


    private static void swap(int[] arr, int current, int next)
    {
        int temp = arr[current];
        arr[current] = arr[next];
        arr[next] = temp;
    }
}
