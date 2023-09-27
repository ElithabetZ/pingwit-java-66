package javaCore.lesson_13.point_1;

public abstract class AbstractPictire implements Picture {

    protected double width;

    public AbstractPictire(double width)
    {
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }
}
