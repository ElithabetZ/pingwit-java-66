package javaCore.lesson_10;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int number)
    {
        if(number == 0)
        {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
