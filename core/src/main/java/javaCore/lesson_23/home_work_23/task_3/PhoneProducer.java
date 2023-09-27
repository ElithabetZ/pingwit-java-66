package javaCore.lesson_23.home_work_23.task_3;
import javaCore.lesson_23.point_0.Phone;
import java.util.List;
import java.util.stream.Collectors;
/*
Task 3 (map + filter)
Есть коллекция телефонов. У телефона есть название и производитель. Необходимо получить из этой коллекции коллекцию производителей (производитель - это строка)
и оставить только те, которые входят в список: Apple, Samsung, Xiaomi
 */
public class PhoneProducer {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("X", "Apple", 280),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<String> producers = phones.stream()
                .map(Phone::producer)
            //лучше сделать коллекцию из этих слов и вызывать у этой коллекции contains
                .filter(producer->producer.equals("Apple")||producer.equals("Samsung")||producer.equals("Xiaomi"))
                .collect(Collectors.toList());
        System.out.println(producers);
    }
}
