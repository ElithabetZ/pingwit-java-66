package org.example.lesson_27.home_work_27.task_1;

import java.util.Objects;

public class StudAddress {

    private String street;
    private int streetNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudAddress that)) return false;
        return streetNumber == that.streetNumber && Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, streetNumber);
    }

    @Override
    public String toString() {
        return "StudAddress{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
