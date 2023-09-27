package javaCore.lesson_10.home_work_10.task_2;

import java.util.Random;

public class Branch {
    private Fruit name;
    // numOfFruits
    private int howManyFruits;
    //это не поле класса. Как оно характеризует ветку?
    private Random rand = new Random();
    //тоже сомнитетельное название для поля класса. Выглядит как константа - static final.
    private int upperbound = 100;

    /* и должен быть второй конструктор : 
        public Branch(Fruit fruit) {
        this(fruit, new Random().nextInt(upperbound));
        
    }
    */
    public Branch(Fruit name, int howManyFruits)
    {
        this.name = name;
        this.howManyFruits = howManyFruits;
    }

    public Branch(Fruit name)
    {
        this.name = name;
        this.howManyFruits = rand.nextInt(upperbound);
    }
    public Fruit getName() {
        return name;
    }

    public int getHowManyFruits() {
        return howManyFruits;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name=" + name +
                ", howManyFruits=" + howManyFruits +
                '}';
    }
}
