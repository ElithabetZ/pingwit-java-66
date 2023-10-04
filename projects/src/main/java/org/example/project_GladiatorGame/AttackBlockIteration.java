package org.example.project_GladiatorGame;

import java.util.Random;
import java.util.Scanner;
public class AttackBlockIteration {

    private int firstGladiatorScore;
    private int secondGladiatorScore;

    public AttackBlockIteration(int firstGladiatorScore, int secondGladiatorScore) {
        this.firstGladiatorScore = firstGladiatorScore;
        this.secondGladiatorScore = secondGladiatorScore;
    }

    public int resultOfAttack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one attack mode: " + "\n" +
                "1 - strike to the head" + "\n" +
                "2 - body blow" + "\n" +
                "3 - kick");
        int attackWay = scanner.nextInt();
        int blockWay = new Random().nextInt(1, 4);
        if (attackWay != blockWay) {
            return ++this.firstGladiatorScore;
        } else {
            return this.firstGladiatorScore;
        }
    }

    public int resultOfBlock() {
        Scanner scanner = new Scanner(System.in);
        int attackWay = new Random().nextInt(1, 4);
        System.out.println("Opponent try "+ attackWay + " type of attack");
        System.out.println("Choose one block mode: " + "\n" +
                "1 - top block" + "\n" +
                "2 - mid-block" + "\n" +
                "3 - lower unit");
        int blockWay = scanner.nextInt();
        if (attackWay != blockWay) {
            return ++this.secondGladiatorScore;
        } else {
            return this.secondGladiatorScore;
        }
    }
}
