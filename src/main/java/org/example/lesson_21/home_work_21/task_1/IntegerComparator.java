package org.example.lesson_21.home_work_21.task_1;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {
        return i1.intValue() - i2.intValue();
    }
}
