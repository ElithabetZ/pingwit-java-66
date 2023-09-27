package javaCore.lesson_15.home_work_15.lesson_5;

public class InsufficientFundsException extends Exception{
    private int sum;

    public InsufficientFundsException(String message, int sum){
        super(message);
        this.sum = sum;
    }

    public int getSum(){
        return this.sum;
    }
}
