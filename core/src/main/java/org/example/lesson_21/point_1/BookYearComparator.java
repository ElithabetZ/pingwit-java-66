package org.example.lesson_21.point_1;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2){
        return o1.year() - o2.year();
    }
}
