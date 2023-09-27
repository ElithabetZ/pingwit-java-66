package javaCore.lesson_24.point_3;

import javaCore.lesson_23.point_0.Phone;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

    public static void main(String[] args) {

        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        boolean allMatchResult = phones.stream()
                .allMatch(phone -> phone.price() > 100);
        System.out.println(allMatchResult);

        boolean anyMatchResult = phones.stream()
                .anyMatch(phone -> phone.price() > 300);
        System.out.println(anyMatchResult);

        List<String> words = Arrays.asList("", null, "cccc", "d", "e");
        boolean result = words.stream()
                .anyMatch(String::isBlank);
        System.out.println(result);

        List<Integer> ints = Arrays.asList(1, 2, 3, 11, 1, 12);
        boolean resultI = ints.stream()
                .allMatch(x -> x > 1);
        System.out.println(resultI);
    }
}
