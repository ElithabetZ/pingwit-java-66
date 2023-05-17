package org.example.lesson_3;

public class SwitchExample {
    public static void main(String[] args) {

        int m = 30;

        switch (m) {
            case 27:
                System.out.println("case 1");
                break;
            case 28:
                System.out.println("case 2");
                break;
            case 30:
                System.out.println("case 3");
                break;
            default:
                System.out.println("case 4");
                break;
        }

        switch (m) {
            case 27 -> System.out.println("case 1");
            case 30 -> System.out.println("case 2");
            case 31 -> System.out.println("case 3");
            default -> System.out.println("next");
        }

        int x = 100;
        int y = 45;
        int z = 20;

        int max = x;
        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        int max2 = (x > y) ? x : y;
        max2 = (z > max2) ? z : max2;
        System.out.println(max);
        if (x > y) {
            if (x > z) {
                System.out.println("The biggest X");
            } else {
                System.out.println("The biggest Z");
            }
        } else {
            if (y > z) {
                System.out.println("The biggest Y");
            } else {
                System.out.println("The biggest Z");
            }
        }
    }
}
