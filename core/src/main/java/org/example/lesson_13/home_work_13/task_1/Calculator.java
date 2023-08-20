package org.example.lesson_13.home_work_13.task_1;
//+
public class Calculator {
    //обычно тут идет еще пустая строка между классом и методом
    public double calculate(double num1, double num2, Operation operation) {
        return operation.operate(num1, num2);
    }

    public static void main(String[] args) {
        double resultDiv = new Calculator().calculate(16,2, new Division());
        System.out.println(resultDiv);
        double resultAdd = new Calculator().calculate(16,2, new Addition());
        System.out.println(resultAdd);
        double resultSub = new Calculator().calculate(16,2, new Subtraction());
        System.out.println(resultSub);
        double resultMult = new Calculator().calculate(16,2, new Multiplication());
        System.out.println(resultMult);
    }
}
