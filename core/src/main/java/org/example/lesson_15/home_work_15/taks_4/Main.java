package org.example.lesson_15.home_work_15.taks_4;

import java.util.Scanner;

public class Main {
    //пользователь в отдельный метод 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type numerator");
        int numerator = scan.nextInt();
        System.out.println("Type denominator");
        int denominator = scan.nextInt();
        try{
        Division.division(numerator,denominator);
        }catch (ExeptionDivision e){
            System.out.println(e.getMessage());
        }
    }
}
