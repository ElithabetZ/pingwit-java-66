package org.example.lesson_28.point_2;

public class MyThreadExample extends Thread {

    public MyThreadExample(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 7; i++){
            System.out.println("AAAAA");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
