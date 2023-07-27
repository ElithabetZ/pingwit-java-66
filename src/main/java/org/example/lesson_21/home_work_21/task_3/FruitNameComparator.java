package org.example.lesson_21.home_work_21.task_3;

import java.util.Comparator;
//+
public class FruitNameComparator implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2) {
        return f1.getName().compareTo(f2.getName());
    }
}
