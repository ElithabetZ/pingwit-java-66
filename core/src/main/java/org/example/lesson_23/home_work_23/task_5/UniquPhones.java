package org.example.lesson_23.home_work_23.task_5;
import org.example.lesson_23.point_0.Phone;
import java.util.List;
import java.util.stream.Collectors;
/*
Task 6 (distinct)
Есть коллекция телефонов, нужно убрать все повторяющиеся
 */
//+
public class UniquPhones {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("S10", "Samsung", 250)
        );

        List<Phone> uniqPhones = phones.stream()
                .distinct()
                .collect(Collectors.toList());
        uniqPhones.forEach(System.out::println);
    }
}
