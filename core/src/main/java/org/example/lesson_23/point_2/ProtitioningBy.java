package org.example.lesson_23.point_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProtitioningBy {

    public static void main(String[] args) {
        List<String> strings = List.of("as a the d in and".split("\\s+"));
        Map<Boolean, List<String>> boolLenght = strings.stream()
                .collect(Collectors.partitioningBy(str->str.length()<2));
        System.out.println(boolLenght);


    }
}
