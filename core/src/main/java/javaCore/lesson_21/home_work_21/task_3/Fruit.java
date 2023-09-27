package javaCore.lesson_21.home_work_21.task_3;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{

    private String name;
    //можно и просто примитив тут использовать
    private Double weight;
    private FruitType type;//cool!

    public Fruit() {
    }

    public Fruit(String name, Double weight, FruitType type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public FruitType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public int compareTo(Fruit fruit) {
        int nameResult = this.name.compareTo(fruit.name);
        if (nameResult != 0) {
            return nameResult;
        }
        int typeResult = this.type.compareTo(fruit.type);
        if (nameResult != 0) {
            return typeResult;
        }
        return this.weight.intValue() - fruit.weight.intValue();
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit fruit)) return false;
        return Double.compare(fruit.weight, weight) == 0 && Objects.equals(name, fruit.name) && type == fruit.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, type);
    }


}
