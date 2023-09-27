package javaCore.lesson_11.point_2;

public class Main {
    public static void main(String[] args) {
        Dog dog2 = new Dog();

        boolean isItTrue = dog2 instanceof ANimal;
        System.out.println(isItTrue);

        Flyable bird = new Birds();
        Flyable airplane = new Airplane();

        if(bird instanceof Flyable)
        {
            System.out.println("bird is instanceof Fluable");
        }

        if(airplane instanceof Flyable)
        {
            System.out.println("airplane is instanceof Fluable");
        }
    }
}
