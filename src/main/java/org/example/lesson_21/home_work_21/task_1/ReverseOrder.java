package org.example.lesson_21.home_work_21.task_1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
Есть TreeSet чисел, нужно отсортировать его в обратном порядке
 */
public class ReverseOrder {
    public static void main(String[] args) {
        int counter = 5;
        Comparator<Integer> integerComparator = new IntegerComparator();
        integerComparator = integerComparator.reversed();
        Set<Integer> numbersReversed = new TreeSet<>(integerComparator);
        getNumbers(numbersReversed, counter);
        System.out.println(numbersReversed);
    }

    public static void getNumbers(Set<Integer> set, int counter) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type " + counter + " integers");
        for(int i = 0; i < counter; i++){
            set.add(scan.nextInt());
        }
    }
}
