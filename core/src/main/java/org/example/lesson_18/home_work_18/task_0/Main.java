package org.example.lesson_18.home_work_18.task_0;

public class Main {

    public static void main(String[] args) {
        NaturalNumber<Integer> number = new NaturalNumber<>(10);
        NaturalNumber<Integer> number2 = new NaturalNumber<>(-12);
        System.out.println(number.isNatrual());
        System.out.println(number2.isNatrual());
    }
}
