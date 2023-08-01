package org.example.lesson_23.point_2;

import org.example.lesson_23.point_0.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 2, 3));
        list.add(List.of(4, 5, 6));
        list.add(List.of(7, 8, 9));
        List<Integer> integerList = list.stream()
                .flatMap(List::stream)
                .filter(x -> x > 4)
                .collect(Collectors.toList());
        System.out.println(integerList);

        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Sumsung", 350),
                new Phone("3310", "Nokia", 1000)
        );


    }
}
