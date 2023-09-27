package javaCore.lesson_4;

import java.util.Scanner;

public class CustomMethod {
    public static void main(String[] args) {
        int max = getMaxNumber();
        findSum(max);
    }

    public static void findSum(int maxNumber) {
        int i = 0;
        int sum = 0;
        while (i <= maxNumber){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    static int getMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number: ");
        int max = scanner.nextInt();
        return max;
    }
}
