package javaCore.lesson_28.point_2;

public class MyRunnableExample implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Thread ->>>" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
