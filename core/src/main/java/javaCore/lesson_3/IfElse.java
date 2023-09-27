package javaCore.lesson_3;

public class IfElse {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("Hello");
        } else {
            System.out.println("else...");
        }

        if (x < 8) {
            System.out.println("x < 8");
        } else if (x < 11) {
            System.out.println("x < 11");
        } else {
            System.out.println("else...");
        }

        int number = 20;
        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Not even");
        }


        String result = number % 2 == 0 ? "Even" : "Not Even";
        System.out.println(result);
    }
    }
