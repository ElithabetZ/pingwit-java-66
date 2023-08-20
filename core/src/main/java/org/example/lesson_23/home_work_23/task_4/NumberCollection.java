package org.example.lesson_23.home_work_23.task_4;
import java.util.List;
import java.util.Optional;
/*

        Task 4 (filter + findFirst)
        Есть коллекция чисел, найти первое, которое будет больше 22.

 */
// форматируй код!
public class NumberCollection {

    public static void main(String[] args) {
        int minValue = 22;
        List<Integer> numbers = List.of(11,2,4,56,78,9,4,5,678);

        Optional<Integer> number = numbers.stream()
                .filter(x->x>minValue)
                .findFirst();
        System.out.println(number);
    }
}
