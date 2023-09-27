package javaCore.lesson_13.home_work_13.task_2;

import java.util.Objects;

//+
public abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    protected double getPrice(){
        return this.price;
    }

    protected double getQuantity(){
        return this.quantity;
    }

    protected String getName(){
        return this.name;
    }
}
