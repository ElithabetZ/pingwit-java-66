package org.example.lesson_18.point_2;

import org.example.lesson_13.home_work_13.task_2.Product;

public class GenericWarehouse<T> {

    private T[] products;

    public GenericWarehouse(T[] products){
        this.products = products;
    }

    public T[] getProducts() {
        return products;
    }

    public void setProducts(T[] products) {
        this.products = products;
    }
}
