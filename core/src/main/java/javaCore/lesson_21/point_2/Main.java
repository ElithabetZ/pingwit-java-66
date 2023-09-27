package javaCore.lesson_21.point_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        iterateAnimals(cats);
    }

    public static void iterateAnimals(Collection<? extends Animal> animals){
        for (Animal an: animals) {
            System.out.println("Inside loop one more tume");
        }
    }
}
