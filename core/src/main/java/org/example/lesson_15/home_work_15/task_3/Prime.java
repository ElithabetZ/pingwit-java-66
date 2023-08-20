package org.example.lesson_15.home_work_15.task_3;

public class Prime {
    //find - искать. значит метод должен не boolean возвращать
    //в таоем случае - isPrime
    public static boolean findPrime(int number) throws ExeptionPrime{
        if (number <= 1) {
            throw new ExeptionPrime("The number is less than 1", number);
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
