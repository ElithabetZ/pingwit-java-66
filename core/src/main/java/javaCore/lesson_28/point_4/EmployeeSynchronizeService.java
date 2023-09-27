package javaCore.lesson_28.point_4;

public class EmployeeSynchronizeService {

    public synchronized void add(Stock stock){
        stock.setQuantity(stock.getQuantity()+1);
    }

    /*

    public  void addSyncBlock(Stock stock){
        //synchronized (EmployeeSynchronizeService.class)
        //synchronized (this)
        synchronized (stock){
            stock.setQuantity(stock.getQuantity()+1);
        }
    }
    */
}
