package org.example.lesson_22.home_work_22.task_5;

import org.example.lesson_21.home_work_21.task_3.Fruit;

import java.util.Comparator;

public class SporstmanComparator implements Comparator<Sportsman> {
    public int compare(Sportsman f1, Sportsman f2) {
        return f1.getCurrentResult().compareTo(f2.getCurrentResult());
    }
}
