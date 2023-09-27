package javaCore.lesson_15.home_work_15.gladiatorGame;

public class Combat {

    private Gladiator firstGladiator;
    private Gladiator secondGladiator;
    private int firstGladiatorScore;
    private int secondGladiatorScore;

    public Combat(Gladiator firstGladiator, Gladiator secondGladiator) {
        this.firstGladiator = firstGladiator;
        this.secondGladiator = secondGladiator;
        this.firstGladiatorScore = 0;//оно и так по дефолту будет 0
        this.secondGladiatorScore = 0;
    }

    public void fight() {
        //4 - константа - health, например
        while (firstGladiatorScore < 4 && secondGladiatorScore < 4) {
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
