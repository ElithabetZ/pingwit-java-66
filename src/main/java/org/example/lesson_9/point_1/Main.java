package org.example.lesson_9.point_1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.move();
        print(cat);

        Animal dog = new Dog();
        dog.eat();
        dog.move();
        print(dog);
    }

    public static void print(Animal animal){
        animal.eat();
        animal.move();
        animal.sleep();
    }
}
