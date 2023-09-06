package org.example.lesson_29.point_3;

public class SummaryRunnable implements Runnable {

    private final Integer taskNumber;

    public SummaryRunnable(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println("Working " + taskNumber + " and " + Thread.currentThread());
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Is done " + taskNumber + Thread.currentThread());
    }
}
