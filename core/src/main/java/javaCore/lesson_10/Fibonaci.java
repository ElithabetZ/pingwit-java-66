package javaCore.lesson_10;

public class Fibonaci {
    public static void main(String[] args) {

    }

    public static int fibonaci(int number)
    {
        if(number < 2)
        {
            return 1;
        } else {
            return fibonaci(number - 1) + fibonaci(number - 2);
        }
    }
}
