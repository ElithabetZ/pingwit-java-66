package javaCore.lesson_24.point_6;
import javaCore.lesson_23.point_0.Phone;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<Phone> result = phones.stream()
                .sorted(Comparator.comparing(Phone::price).thenComparing(Phone::model))
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("hththt", "null", "cccc", "d", "e");
         words.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo));
    }
}
