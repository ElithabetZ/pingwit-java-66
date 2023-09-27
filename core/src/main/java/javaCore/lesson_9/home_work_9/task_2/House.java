package javaCore.lesson_9.home_work_9.task_2;

public abstract class House {
    private String typeOfHouse;

    public House(String typeOfHouse)
    {
        this.typeOfHouse = typeOfHouse;
    }
    public abstract int getNumberOfFloars();
    public abstract void turnOnHiting();
    public abstract double getNumberOfPeople();

}
