package org.example.lesson_24.home_work_24.task_2;

import java.util.Arrays;
import java.util.List;

/*
Есть коллекция чисел, найти произведение первых 5ти элементов.
 */
public class MultiFirstElem {
    //+
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 1, 2, 1, 6, 3, 100, 189);
        Integer result = numbers.stream()
                .limit(5)
                .reduce(1, (multiply, element) -> multiply * element);//нейминг не очень. лучше (partial, elem). Multiply - глагол
        System.out.println(result);
    }
}
