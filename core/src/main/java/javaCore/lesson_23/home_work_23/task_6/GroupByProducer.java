package javaCore.lesson_23.home_work_23.task_6;
import javaCore.lesson_23.point_0.Phone;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Task 7
Есть коллекция телефонов, нужно сгруппировать по компании и вывести на экран
 */
//форматирование
public class GroupByProducer {

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

        Map<String, List<Phone>> producerToPhone= phones.stream()
                .collect(Collectors.groupingBy(Phone::producer));
        producerToPhone.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}
