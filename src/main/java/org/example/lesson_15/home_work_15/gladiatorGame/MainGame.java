package org.example.lesson_15.home_work_15.gladiatorGame;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's start the Game!" + "\n" + "Type your name, Gladiator!");
        Gladiator user = new Gladiator(scanner.next());
        Gladiator opponent = new Gladiator();
        System.out.println("Combat" + "\n" + user.getName() + " vs " + opponent.getName());
        System.out.println("Are you ready?");
        String beggining = scanner.next();
        if(!beggining.isEmpty()) {
            Combat combat = new Combat(user, opponent);
            combat.fight();
        }
    }
}
