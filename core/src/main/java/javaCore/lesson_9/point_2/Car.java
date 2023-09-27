package javaCore.lesson_9.point_2;

public class Car extends Venicle{
    private String carSpecificField;
    public Car(String name, String carSpecificField)
    {
        super(name);
        this.carSpecificField = carSpecificField;
    }
    public void drive()
    {
        System.out.println("I'm driving car");
    }
}
