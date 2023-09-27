package javaCore.lesson_18.point_2;

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
