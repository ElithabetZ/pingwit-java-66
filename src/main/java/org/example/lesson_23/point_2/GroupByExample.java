package org.example.lesson_23.point_2;

import org.example.lesson_23.point_0.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {

    List<Phone> phones = List.of(
            new Phone("X", "Apple", 280),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
    );

    Map<String, List<Phone>> producerToPhonesMap =  phones.stream()
            .collect(Collectors.groupingBy(Phone::producer));

        producerToPhonesMap.forEach((k,v) ->{
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });


    }
}
