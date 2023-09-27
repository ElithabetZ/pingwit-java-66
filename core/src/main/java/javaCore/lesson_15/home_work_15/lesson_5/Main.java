package javaCore.lesson_15.home_work_15.lesson_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User mike = new User("Mike", 1500);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many you want to withdraw?");
        int sumToWithDraw = scanner.nextInt();
        try {
            mike.withDraw(sumToWithDraw);
        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("You have only "+e.getSum());
        }
    }
}
