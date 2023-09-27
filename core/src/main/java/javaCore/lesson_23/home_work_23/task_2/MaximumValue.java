package javaCore.lesson_23.home_work_23.task_2;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
/*
Task 2 (max, String::compareTo / Comparator.naturalOrder())
Есть коллекция строк, нужно найти строку с максимальной длинной.
 */
//круто, что прочитала про новое :)
public class MaximumValue {

    public static void main(String[] args) {
        List<String> list = List.of("Abrdias", "newowe", "bwieuio", "noweihfowei", "owei", "boew");
        String maxValue = list.stream()
                .max(Comparator.comparing(String::length))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxValue);

        String minValue = list.stream()
                .max(String::compareTo)
                .orElseThrow(NoSuchElementException::new);
        System.out.println(minValue);

        String minValue2 = list.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);
        System.out.println(minValue2);
    }
}
