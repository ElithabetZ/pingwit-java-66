package javaCore.lesson_3.homeWork3;
/*
Вычислить: 1+2+4+8+...+256
 */
//+
public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i*=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
