package org.example.lesson_29.point_5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Store {

    private final AtomicInteger hotDogsStatistics = new AtomicInteger();

    private final AtomicLong vegetablesStatistics = new AtomicLong();

    private final AtomicBoolean isOpen = new AtomicBoolean();

    public Integer eat(){
        return hotDogsStatistics.incrementAndGet();// увеличить и забрать
    }

    public Integer getHotDogStatistics(){
        return hotDogsStatistics.get();// забрать
    }
}
