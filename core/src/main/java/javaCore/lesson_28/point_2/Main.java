package javaCore.lesson_28.point_2;

public class Main {

    public static void main(String[] args) {
        MyRunnableExample myRunnableExample = new MyRunnableExample();
        Thread thread = new Thread(myRunnableExample);
        thread.start();

        MyThreadExample custom = new MyThreadExample("Current");
        custom.start();
    }
}
