package org.example.lesson_28.point_4;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Stock stock = new Stock(0);
        EmployeeSynchronizeService service = new EmployeeSynchronizeService();
        EmployeeServiceRunnable runnable = new EmployeeServiceRunnable(stock, 1000, service);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(stock);
    }
}
