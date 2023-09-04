package org.example.lesson_28.home_work_28.task_4;

import java.util.Objects;
//можно было не заводить отдельный класс на количество
public class Quantity {
    private int quantity;

    public Quantity() {
        this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quantity quantity1)) return false;
        return quantity == quantity1.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}
