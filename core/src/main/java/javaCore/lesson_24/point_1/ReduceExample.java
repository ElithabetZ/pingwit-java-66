package javaCore.lesson_24.point_1;

import javaCore.lesson_23.point_0.Phone;

import java.util.Arrays;
import java.util.List;


public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer result = numbers.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        //reduce(0, Integer::sum)
        System.out.println(result);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String concat = letters.stream()
                .reduce("", (part, elem) -> part + elem);
        //reduce(0, String::concat);
        System.out.println(concat);


        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        Integer reduce = phones.stream()
                .reduce(0, (partiaPrice, phone) -> partiaPrice + phone.price(), Integer::sum);

        Integer integer = letters.stream()
                .map(String::length)
                .reduce(0, Integer::sum);
    }
}
