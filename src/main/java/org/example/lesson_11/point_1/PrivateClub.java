package org.example.lesson_11.point_1;

public class PrivateClub {
    public static int NUM_OF_VIP = 10;
    private String clubName;
    private int members;

    public PrivateClub()
    {
        this.clubName = "Super Club";
        this.members = 10;
        //this("Super Club", 10);
    }

    private PrivateClub(String clubName)
    {
        this.clubName = clubName;
        this.members = 10;
    }

    private PrivateClub(String clubName, int members)
    {
        this.clubName = clubName;
        this.members = members;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
                "clubName='" + clubName + '\'' +
                ", members=" + members +
                '}';
    }
}
