package javaCore.lesson_15.home_work_15.task_3;
//всегда сначала название, а потом само слово Exception
//то есть PrimeException
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
