package javaCore.lesson_30.point_1;

public class DeadlockExample {

    public static Object LOCK_1 = new Object();
    public static Object LOCK_2 = new Object();
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1 lock LOCK_1");
        synchronized (DeadlockExample.LOCK_1){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (DeadlockExample.LOCK_2) {
                System.out.println("Thread 1 lock LOCK_2");
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 2 lock LOCK_1");
        synchronized (DeadlockExample.LOCK_2){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (DeadlockExample.LOCK_1) {
                System.out.println("Thread 1 lock LOCK_1");
            }
        }
    }
}
