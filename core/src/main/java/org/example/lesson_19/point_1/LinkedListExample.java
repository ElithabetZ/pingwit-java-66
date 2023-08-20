package org.example.lesson_19.point_1;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        //add
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println(animals);
        animals.add(0, "Hourse");
        System.out.println(animals);

        //get
        System.out.println(animals.get(1));

        //set
        animals.set(1, "Rat");
        System.out.println(animals);


    }
}
