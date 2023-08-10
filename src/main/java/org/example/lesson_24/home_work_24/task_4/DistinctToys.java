package org.example.lesson_24.home_work_24.task_4;

import org.example.lesson_24.home_work_24.task_3.TreeToy;

import java.util.Arrays;
import java.util.List;
/*
Используем класс елочных игрушек из Task 3. Создайте несколько одинаковых игрушек, обязательно чтобы было несколько
одинаковых и поместите их в лист.
При помощи метода distinct и стримов посчитайте количество уникальных игрушек.
 */
public class DistinctToys {

    public static void main(String[] args) {
        List<TreeToy> listOfTreeToys = Arrays.asList(
                new TreeToy("Star", "blue", true),
                new TreeToy("Fish", "blue", false),
                new TreeToy("Bell", "white", true),
                new TreeToy("Fish", "blue", false),
                new TreeToy("Bell", "white", true),
                new TreeToy("Lolly", "pink", false),
                new TreeToy("Train", "yellow", true)
        );

        Long distinctToys = listOfTreeToys.stream()
                .distinct()
                .count();
        System.out.println("All tree toys in this list: " + listOfTreeToys.size());
        System.out.println("In this list of tree toys there are " + distinctToys + " distinct toys");
    }
}
