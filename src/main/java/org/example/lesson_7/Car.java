package org.example.lesson_7;

public class Car {
    private int age;
    private String model;

    public Car(int age, String model){
        this.age = age;
        this.model = model;
    }

    public int getAge(){
        return age;
    }

    public String getModel(){
        return model;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", model='" + model + '\'' +
                '}';
    }
}
