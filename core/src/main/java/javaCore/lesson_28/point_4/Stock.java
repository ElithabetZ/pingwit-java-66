package javaCore.lesson_28.point_4;

public class Stock {

    private Integer quantity;

    public Stock(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "quantity=" + quantity +
                '}';
    }
}
