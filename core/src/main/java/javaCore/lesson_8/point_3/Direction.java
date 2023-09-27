package javaCore.lesson_8.point_3;

public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String shortCode;

    Direction(String shortCode){
        this.shortCode = shortCode;
    }

    public String getShortCode()
    {
        return shortCode;
    }
}
