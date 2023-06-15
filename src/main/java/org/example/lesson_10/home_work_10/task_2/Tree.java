package org.example.lesson_10.home_work_10.task_2;

import java.util.Arrays;

public class Tree {
    //у тебя в ветках уже фрукты, поэтому этого поля здесь не должно быть
    private Fruit name;
    //подразумевалось, что дерево - одна ветка, ибо пользователь может создать на одном дереве ветки с разными фруктами:)
    private Branch[] branches;
    //этого поля здесь не должно быть
    private int sumOfFruits;

    public Tree(Fruit name, Branch[] branches)
    {
        for(int i = 0; i < branches.length; i++)
        {
            if(name != branches[i].getName())
            {
                System.out.println("Oppps... Only one type of fruits");
                break;
            }
        }
        this.name = name;
        this.branches = branches;
    }
    protected int getFruits() {
        for(int i = 0; i < branches.length; i++)
        {
            sumOfFruits+=branches[i].getHowManyFruits();
        }
        return sumOfFruits;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name=" + name +
                ", branches=" + Arrays.toString(branches) +
                ", sumOfFruits=" + sumOfFruits +
                '}';
    }

    public Fruit getName() {
        return name;
    }
}
