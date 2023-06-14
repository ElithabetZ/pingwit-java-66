package org.example.lesson_10.home_work_10.task_2;

import java.util.Random;

public class Branch {
    private Fruit name;
    private int howManyFruits;
    private Random rand = new Random();
    private int upperbound = 100;

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
