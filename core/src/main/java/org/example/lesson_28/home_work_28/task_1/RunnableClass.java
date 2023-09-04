package org.example.lesson_28.home_work_28.task_1;
//+
public class RunnableClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
