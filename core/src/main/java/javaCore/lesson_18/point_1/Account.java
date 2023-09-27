package javaCore.lesson_18.point_1;

public class Account<T, N extends Number> {

    private T id;
    private N sum;
    private String country;

    public <D> Account(T id, N sum, D country) {
        this.id = id;
        this.sum = sum;
        this.country = country.toString();
    }

    public T getId() {
        return id;
    }

    public N getSum() {
        return sum;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setSum(N sum) {
        this.sum = sum;
    }
}
