package org.example.config.home_work_2.ApplicationBody;

import java.util.Objects;
//в папку com.entity/model
public class Employee{
//где private?
    Long id;
    String name;
    Integer ratePerHour;

    public Employee(String name){
        this.name = name;
        this.ratePerHour = 0;
    }

    public Employee(String name, Integer ratePerHour){
        this.name = name;
        this.ratePerHour = ratePerHour;
    }

    public Employee(Long id, String name, Integer ratePerHour){
        this.id = id;
        this.name = name;
        this.ratePerHour = ratePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getRatePerHour() {
        return ratePerHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(ratePerHour, employee.ratePerHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ratePerHour);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}
