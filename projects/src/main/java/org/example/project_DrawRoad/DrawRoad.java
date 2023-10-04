package org.example.project_DrawRoad;

import java.util.Scanner;
public class DrawRoad {
    public static void main(String[] args) {
        int timeLimitSeconds = getTimeInSec();
        long presentTime = System.currentTimeMillis();
        long timeLimitMils = presentTime + (timeLimitSeconds * 1000);

        while (presentTime <= timeLimitMils) {
            drawTheRoad();
            presentTime = System.currentTimeMillis();
        }
    }

    public static void drawTheRoad() {
        for (int i = 0; i <= 6; i++) {
            String emptySymbol = "";
            for (int k = 0; k <= 6 - i; k++) {
                emptySymbol += " ";
            }
            emptySymbol += "||   |   ||";
            System.out.println(emptySymbol);
        }

        for (int i = 0; i <= 6; i++) {
            String emptySymbolTwo = "";
            for (int n = 0; n <= i - 1; n++) {
                emptySymbolTwo += " ";
            }
            emptySymbolTwo += "||   |   ||";
            System.out.println(emptySymbolTwo);
        }
    }

    public static int getTimeInSec(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many seconds you want to drive:)");
        int timeLimitSeconds = scan.nextInt();
        return timeLimitSeconds;
    }
}
