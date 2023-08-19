package org.example.lesson_24.home_work_24.task_3;

import java.util.Arrays;
import java.util.List;

/*
Есть коллекция елочных игрушек, надо узнать у всех ли игрушек есть крепеж на елку.
 */
public class ArrayOfTreeToys {

    public static void main(String[] args) {
        List<TreeToy> listOfTreeToys = Arrays.asList(
                new TreeToy("Star", "blue", true),
                new TreeToy("Fish", "blue", false),
                new TreeToy("Bell", "white", true),
                new TreeToy("Lolly", "pink", false),
                new TreeToy("Train", "yellow", true)
        );
        //allFastener
        boolean isAllFastener = listOfTreeToys.stream()
                .allMatch(treeToy -> treeToy.fastener() == true);//== true необязательно
        System.out.println("In this list of tree toys all toys have fastener?  == " + isAllFastener);
    }
}
