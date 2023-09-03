package org.example.lesson_28.point_4;

public class EmployeeServiceRunnable implements Runnable{

    private final EmployeeSynchronizeService service;
    private final Stock stock;
    private final Integer quatity;

    public EmployeeServiceRunnable(Stock stock, Integer quatity, EmployeeSynchronizeService service) {
        this.stock = stock;
        this.quatity = quatity;
        this.service = service;
    }

    @Override
    public void run() {
        for(int i = 0; i < quatity; i++){
            System.out.println(i+Thread.currentThread().getName());
            stock.setQuantity(stock.getQuantity()+1);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finish"+Thread.currentThread().getName());
    }
}
