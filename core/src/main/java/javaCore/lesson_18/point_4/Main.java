package javaCore.lesson_18.point_4;

import javaCore.lesson_18.point_1.Box;

public class Main {

    public static void main(String[] args) {
        Object someObj = new Object();
        Integer someInteger = 10;
        someObj = someInteger;
        someMethod(11);
        someMethod(10.1);

        Box<Number> boxNum = new Box<>();
        Box<Integer> boxInteger = new Box<>();
     }

    public static void someMethod(Number n){

    }
}
