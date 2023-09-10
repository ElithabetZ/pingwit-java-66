package org.example.lesson_30.point_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class LoginQueueUsingSemaphoreExample {
    private final Semaphore semaphore;

    public LoginQueueUsingSemaphoreExample(int slotLimit){
        semaphore = new Semaphore(slotLimit);
    }

    void login(){
        try{
            semaphore.acquire();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    boolean tryLogin(){
       return semaphore.tryAcquire();
    }

    void logout(){
        semaphore.release();
    }

    int availableSlots(){
        return semaphore.availablePermits();
    }
}

class LoginQueueUsingSemaphoreExampleMain{
    public static void main(String[] args) throws InterruptedException {

        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginQueueUsingSemaphoreExample loginQueue = new LoginQueueUsingSemaphoreExample(slots);
        IntStream.range(0, slots).forEach(user -> executorService.execute(loginQueue::tryLogin));

        //executorService.awaitTermination(100, TimeUnit.MILLISECONDS);
        executorService.shutdown();

        System.out.println(loginQueue.availableSlots());
        //loginQueue.logout();
        System.out.println(loginQueue.tryLogin());
    }
}
