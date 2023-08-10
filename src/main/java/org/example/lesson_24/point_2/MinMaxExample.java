package org.example.lesson_24.point_2;

import org.example.lesson_23.point_0.Phone;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );


        Optional<Phone> minphone =  phones.stream()
                .min(Comparator.comparing(Phone::price));
        System.out.println(minphone);
        Optional<Phone> maxphone =  phones.stream()
                .max(Comparator.comparing(Phone::price));
        System.out.println(maxphone);

        IntSummaryStatistics statistics = phones.stream()
                .map(Phone::price)
                .collect(Collectors.summarizingInt(pr->pr));
        System.out.println(statistics.getAverage());
    }
}
