package org.example.project_GladiatorGame;

public class Combat {

    private Gladiator firstGladiator;
    private Gladiator secondGladiator;
    private int firstGladiatorScore;
    private int secondGladiatorScore;
    private int health = 4;

    public Combat(Gladiator firstGladiator, Gladiator secondGladiator) {
        this.firstGladiator = firstGladiator;
        this.secondGladiator = secondGladiator;
    }

    public void fight() {
        while (firstGladiatorScore < health && secondGladiatorScore < health) {
            AttackBlockIteration round = new AttackBlockIteration(firstGladiatorScore, secondGladiatorScore);
            firstGladiatorScore = round.resultOfAttack();
            secondGladiatorScore = round.resultOfBlock();
            System.out.println("Results: " + firstGladiator.getName() + ": " + firstGladiatorScore + "  vs  " + secondGladiator.getName() + " : " + secondGladiatorScore);
        }
        if (firstGladiatorScore > secondGladiatorScore) {
            System.out.println("Congratulations, you win!");
        } else if (secondGladiatorScore > firstGladiatorScore) {
            System.out.println("Sorry, you loose! " + secondGladiator.getName() + " beate you");
        } else {
            System.out.println("It's a draw");
        }
    }
}
