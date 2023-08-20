package org.example.lesson_10;

public class RussionDoll {
    public static void main(String[] args) {
        openDoll(5);
    }

    public static void openDoll(int doll)
    {
        if (doll == 1) {
            System.out.println("All dolls are opened");
        } else {
            openDoll(doll - 1);
        }
    }
}
