package javaCore.lesson_23.point_2;

import javaCore.lesson_23.point_0.Phone;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Sumsung", 350),
                new Phone("3310", "Nokia", 1000)
        );
        List<Phone> filteredPhones = phones.stream()
                .filter(phone -> phone.price() > 300)
                .filter(phone -> phone.producer().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(filteredPhones);
    }
}
