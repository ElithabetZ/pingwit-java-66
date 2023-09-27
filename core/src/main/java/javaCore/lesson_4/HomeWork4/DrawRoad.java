package javaCore.lesson_4.HomeWork4;

import java.util.Scanner;

/*
При старте программы пользователя просят ввести время в пути в секундах.
Затем, при помощи цикла while выводить на экран извилистую дорогу.
 */
public class DrawRoad {
    public static void main(String[] args) {
        int timeLimitSeconds = getTimeInSec();
        long presentTime = System.currentTimeMillis();//present -> current лучше
        //(timeLimitSeconds * 1000) - в переменную
        long timeLimitMils = presentTime + (timeLimitSeconds * 1000);

        while (presentTime <= timeLimitMils) {
            drawTheRoad();
            presentTime = System.currentTimeMillis();
        }
    }

    public static void drawTheRoad() {
        //а что такое 6? В переменную
        for (int i = 0; i <= 6; i++) {
            String codeFirst = "";//название странное, не осмысленное. Можно было просто String emptySymbol = " ";
            for (int k = 0; k <= 6 - i; k++) {
                codeFirst += " ";
            }
            codeFirst += "||   |   ||";
            System.out.println(codeFirst);
        }

        for (int i = 0; i <= 6; i++) {
            String codeSecond = "";
            for (int n = 0; n <= i - 1; n++) {
                codeSecond += " ";
            }
            codeSecond += "||   |   ||";
            System.out.println(codeSecond);
        }
    }

    public static int getTimeInSec(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many seconds you want to drive:)");
        int timeLimitSeconds = scan.nextInt();
        return timeLimitSeconds;
    }
}
