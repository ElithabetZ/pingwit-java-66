package javaCore.lesson_3.homeWork3;
/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++){
//если сделать i+=2, то и проверка не нужна
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
