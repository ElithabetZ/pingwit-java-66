package org.example.lesson_2.home_work_2;

public class JavaTypesAndOperations {
    public static void main(String[] args) {

        // Integer data tapes
        byte myByte1 = 30;
        byte myByte = 15;
        byte sumBytes = (byte) (myByte + myByte1);

        //addition operator (sum) - byte
        System.out.println("Addition operator (sum) - byte");
        System.out.println("myByte1 + myByte = " + sumBytes);
        System.out.println("myByte1 - myByte = " + (myByte - myByte1));
        System.out.println("\n");

        //subtraction, addition, multiplication, division, modulo operators - int
        int myInt1 = 1500;
        int myInt2 = 5250;
        System.out.println("Subtraction, addition, multiplication, division, modulo operators - int");
        System.out.println("myInt1 - myInt2 = " + (myInt1 - myInt2));
        System.out.println("myInt1 + myInt2 = " + (myInt1 + myInt2));
        System.out.println("myInt1 * myInt2 = " + (myInt1 * myInt2));
        System.out.println("myInt1 / myInt2 = " + (myInt1 / myInt2));
        System.out.println("myInt2 / myInt1 = " + (myInt2 / myInt1));
        System.out.println("myInt1 % myInt2 = " + (myInt1 % myInt2));
        System.out.println("myInt2 % myInt1 = " + (myInt2 % myInt1));
        System.out.println("\n");


        //Floating point data types
        float myFloat1 = 237.342f;
        float myFloat2 = -406.0f;

        //subtraction, addition, multiplication, division, modulo operators - float
        System.out.println("Subtraction, addition, multiplication, division, modulo operators - float");
        System.out.println("myFloat1 - myFloat2 = " + (myFloat1 - myFloat2));
        System.out.println("myFloat1 + myFloat2 = " + (myFloat1 + myFloat2));
        System.out.println("myFloat1 * myFloat2 = " + (myFloat1 * myFloat2));
        System.out.println("myFloat1 / myFloat2 = " + (myFloat1 / myFloat2));
        System.out.println("myFloat1 % myFloat2 = " + (myFloat1 % myFloat2));


        //Test - branch
    }
}
