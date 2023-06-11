package org.example.lesson_8.point_1;

public class Main {
    public static void main(String[] args) {
        Person pasha = new Person("Pasha",  22);
        Person pasha2 = new Person("Pasha", 22);

        System.out.println(pasha==pasha2); //false
        System.out.println(pasha.equals(pasha2)); //false
    }
}
