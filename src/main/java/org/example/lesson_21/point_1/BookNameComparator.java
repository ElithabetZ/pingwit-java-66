package org.example.lesson_21.point_1;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2){
        return o1.name().compareTo(o2.name());
    }
}
