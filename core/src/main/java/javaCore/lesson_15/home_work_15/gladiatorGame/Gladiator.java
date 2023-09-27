package javaCore.lesson_15.home_work_15.gladiatorGame;

import java.util.Arrays;
import java.util.Random;
//+
public class Gladiator {

    private String name;
    private String[] opponents = {"Rick", "Snake", "Death"};
    private int opponentIndex = new Random().nextInt(opponents.length);//это можно в конструктор перенести

    public Gladiator(String name) {
        this.name = name;
    }

    public Gladiator() {
        this.name = opponents[opponentIndex];
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gladiator{" +
                "name='" + name + '\'' +
                ", opponents=" + Arrays.toString(opponents) +
                ", opponentIndex=" + opponentIndex +
                '}';
    }
}
