package org.example.lesson_2;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 120;
        short myShort = myByte;
        System.out.println(myShort);

        myByte = (byte) myShort;
        System.out.println(myByte);

        myShort = 200;
        myByte = (byte) myShort;
        System.out.println(myByte);

        double myDouble = 33.67;
        int myInt = (int) myDouble;
        System.out.println(myInt);

        char c = 1000;
        int int100 = c;
        System.out.println(int100);

        String myString = "Hellooooo";

        Byte carSpeed = 25;
        String carSpeedr = carSpeed.toString();
        Byte carSpeedh = carSpeed.byteValue();
        System.out.println(carSpeedh);
    }
}
