package org.example.lesson_4;

public class ReturnExample {
    public static void main(String[] args) {
        int max = 10;
        for (int i = 0; i < max; i++){
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("After Loop");
    }

}
