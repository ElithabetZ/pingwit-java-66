package javaCore.lesson_28.point_3;

import javaCore.lesson_28.point_2.MyThreadExample;

public class StatesExample {

    public static void main(String[] args) {
        MyThreadExample threadExample = new MyThreadExample("aaa");
        threadExample.setDaemon(false);
        System.out.println(threadExample.getState());

        threadExample.start();
        System.out.println(threadExample.getState());

        try {
            threadExample.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadExample.getState());
    }
}