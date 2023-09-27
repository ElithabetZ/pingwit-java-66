package javaCore.lesson_22.home_work_22.task_5;

import java.util.List;
import java.util.Random;

public class Sportsman{

    private String name;
    private Float speed;
    private Float currentResult;
    private List<Medal> medals;

    public Sportsman(String name, Float speed) {
        this.name = name;
        this.speed = speed;
        this.currentResult = new Random().nextFloat();
    }

    public String getName() {
        return name;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public List<Medal> getMedals() {
        return medals;
    }

    public void setMedals(List<Medal> medals) {
        this.medals = medals;
    }

    public Float getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(Float currentResult) {
        this.currentResult = currentResult;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", currentResult=" + currentResult +
                ", medals=" + medals +
                '}';
    }
}
