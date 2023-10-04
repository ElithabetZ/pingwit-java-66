package org.example.project_GladiatorGame;

import java.util.Arrays;
import java.util.Random;
//+
public class Gladiator {

    private String name;
    private String[] opponents = {"Rick", "Snake", "Death"};
    private int opponentIndex = new Random().nextInt(opponents.length);

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
