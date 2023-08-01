package org.example.lesson_22.home_work_22.task_6;
/*
При помощи лямбда выражения, написать свой компаратор, который бы сортировал лист строк в обратном порядке
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//можно еще было  Comparator<String> stringComparator = (String first, String second) ->  -1 * first.compareTo(second)
public class ReverseOrderComparator {
    public static void main(String[] args) {
        List<String> listUser = new ArrayList<>();
        listUser.add("abdjkf");
        listUser.add("vnrevoer");
        System.out.println(listUser);
        ReverseBuilder reverseBuilder = list -> {
            Collections.reverse(list);
        };
        reverseBuilder.reverseOrder(listUser);
        System.out.println(listUser);
    }
}
