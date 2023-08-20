package org.example.lesson_11.point_1;

public class PrivateClubStaticFieldMain {
    public static void main(String[] args) {
        System.out.println(PrivateClub.NUM_OF_VIP);
        PrivateClub.NUM_OF_VIP = 55;
        System.out.println(PrivateClub.NUM_OF_VIP);

    }
}
