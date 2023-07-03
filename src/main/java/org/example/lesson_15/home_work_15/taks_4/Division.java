package org.example.lesson_15.home_work_15.taks_4;

import org.example.lesson_15.home_work_15.task_3.ExeptionPrime;

public class Division {

    //метод - действие, глагол. то есть divide
    public static void division(int numerator, int denominator) throws ExeptionDivision{
        if(denominator==0){
            throw new ExeptionDivision("The denominator can't be 0");
        } else {
            int division = numerator / denominator;
            System.out.println(division);
        }
    }
}
