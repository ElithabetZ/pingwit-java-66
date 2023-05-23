package org.example.lesson_5.homeWork5;

/*
Есть массив чисел. Найти среднее арифметическое число элементов массива
 */
public class AverageOfNumbers {
    public static void main(String[] args) {
        int[] array = {2, 12, 32, 52, 62, 45};
        int sumOfArray = getSumOfArray(array);
        int averageArray = (sumOfArray / array.length);
        System.out.println("Average of the array is " + averageArray);
    }

    public static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        return sum;
    }

    ;

}
