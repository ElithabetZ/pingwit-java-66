package javaCore.lesson_23.home_work_23.task_8;
import javaCore.lesson_23.point_0.Phone;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Есть коллекция телефонов, сделать из нее мапу:
которой ключ - это производитель
вэлью - это кол-во телефонов этого производителя в исходной коллекции
 */
//+
public class MapPhoneCollection {

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

        Map<String, Long> prodecuerToPhone = phones.stream()
                .collect(Collectors.groupingBy(Phone::producer, Collectors.counting()));
        System.out.println(prodecuerToPhone);
    }
}
