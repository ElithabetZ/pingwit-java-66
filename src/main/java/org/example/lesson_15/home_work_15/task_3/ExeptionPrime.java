package org.example.lesson_15.home_work_15.task_3;

public class ExeptionPrime extends Exception{

    private int number;

    public ExeptionPrime(String message, int number){
        super(message);
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}
