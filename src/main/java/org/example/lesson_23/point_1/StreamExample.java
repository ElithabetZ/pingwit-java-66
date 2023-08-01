package org.example.lesson_23.point_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] arr = new String[]{"ab", "bc", "tc"};
        Stream<String> stream = Arrays.stream(arr);
        List<String> list = List.of("ab", "bc", "tc");
        Stream<String> listStream = list.stream();

        IntStream intStream = IntStream.of(10, 20);

        IntStream range = IntStream.range(1, 5);
        IntStream rangeIn = IntStream.rangeClosed(1, 5);
        IntStream naturalNumber = IntStream.iterate(1, n -> n + 1).limit(10);
        naturalNumber.forEach(System.out::println);
    }
}
