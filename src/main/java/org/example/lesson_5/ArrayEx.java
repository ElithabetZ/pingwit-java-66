package org.example.lesson_5;

public class ArrayEx {
    public static void main(String[] args) {
        byte length = 10;
        int[] array = new int[length];

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 600;
        array[7] = 700;
        array[8] = 600;
        array[9] = 800;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.println(array[i]);
        }

        //Второй сопособ

        int[] array2 = {100, 200, 300, 400};
        System.out.println(array2.length);
        System.out.println(array2[0]);
        System.out.println(array2[array2.length-1]);
    }
}
