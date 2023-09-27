package javaCore.lesson_13.home_work_13.task_1;

public class Addition implements Operation {
    @Override
    public double operate(double num1, double num2) {
        //скобки необязательно
        return (num1 + num2);
    }
}
