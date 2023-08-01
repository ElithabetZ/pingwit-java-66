package org.example.lesson_23.home_work_23.task_1;
import java.util.List;
import java.util.stream.Collectors;
/*
Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов
 */
public class FilterExample {
    public static void main(String[] args) {

        int limit = 5;
        List<String> list = List.of("Abrdias", "newowe", "bwieuio", "noweihfowei", "owei", "boew");
        List<String> filteredList = list.stream()
                .filter(word -> word.length() >= limit)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(filteredList);
    }
}
