package org.example.lesson_23.point_2;

import org.example.lesson_23.point_0.Phone;
import org.example.lesson_23.point_0.PhoneShorter;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple1", 400),
                new Phone("S10", "Samsung1", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        Set<String> producers = phones.stream()
                .map(Phone::producer)
                .collect(Collectors.toSet());
        System.out.println(producers);

        List<PhoneShorter> list = phones.stream()
                .map(phone -> new PhoneShorter(phone.model(), phone.producer()))
                .collect(Collectors.toList());
        System.out.println(list);


        List<String> stringsExample = List.of("aa", "s", "and", "sq");
        List<Integer> lengthList = stringsExample.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengthList);


        Map<String, Phone> producerPhone = phones.stream()
                .collect(Collectors.toMap(phone->phone.producer(), Function.identity()));
        System.out.println(producerPhone);

        producerPhone.forEach((k,v) ->{
                System.out.println(k);
        System.out.println(v);
        System.out.println();
        });
    }
}
