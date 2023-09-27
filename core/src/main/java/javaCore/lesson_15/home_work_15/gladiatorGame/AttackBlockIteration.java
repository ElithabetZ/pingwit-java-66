package javaCore.lesson_15.home_work_15.gladiatorGame;

import java.util.Random;
import java.util.Scanner;
//+
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
                "1 - нанести удар в голову" + "\n" +
                "2 - нанести удар в корпус" + "\n" +
                "3 - нанести удар по ногам");
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
                "1 - поставить верхний блок" + "\n" +
                "2 - поставить средний блок" + "\n" +
                "3 - поставить нижний блок");
        int blockWay = scanner.nextInt();
        if (attackWay != blockWay) {
            return ++this.secondGladiatorScore;
        } else {
            return this.secondGladiatorScore;
        }
    }
}
