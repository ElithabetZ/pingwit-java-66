package javaCore.lesson_5;

import java.util.Arrays;

public class TwoDimAray {
    public static void main(String[] args) {
        int[][] twoDimRay = new int[2][3];
        twoDimRay[0][0] = 100;

        System.out.println(twoDimRay.length);
        System.out.println(twoDimRay[0].length);

        for (int i = 0; i < twoDimRay.length; i++) {
            System.out.println(Arrays.toString(twoDimRay[i]));
        }

        for (int i = 0; i < twoDimRay.length; i++) {
            for (int j = 0; j < twoDimRay[i].length; j++) {
                System.out.print(twoDimRay[i][j] + " ");
            }
            System.out.println();
        }
    }
}
