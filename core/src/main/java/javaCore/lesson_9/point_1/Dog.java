package javaCore.lesson_9.point_1;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void move() {
        System.out.println("Cat is eating");
    }
}
