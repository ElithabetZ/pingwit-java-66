package org.example.lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] array = initArray(getLenghtOfArray());
        int sum = countSumOfArray(array);
        System.out.println(sum);
        System.out.println(Arrays.toString(array));
    };

    public static int getLenghtOfArray(){
        Scanner scan = new Scanner(System.in);
        int lenght = 0;
        System.out.println("Type lenght of the Array ");
        lenght = scan.nextInt();
        return lenght;
    };

    public static int[] initArray(int lenght){
        int[] array = new int[lenght];
        for(int i = 0; i < array.length; i++){
            array[i] = i*100;}
            return array;
    };

    public static int countSumOfArray(int[] array){
        int sum = 0;
      for(int index : array) {
         sum+=index;
      };
      return sum;
    };
}
