package org.example.lesson_9.point_1;

public interface Animal {
    double WEIGHT = 1.4;
    void eat();
    void move();

    default void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}
