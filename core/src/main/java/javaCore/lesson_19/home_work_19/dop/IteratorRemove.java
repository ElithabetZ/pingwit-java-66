package javaCore.lesson_19.home_work_19.dop;

import java.util.ArrayList;
import java.util.List;

public class IteratorRemove {

    public static void main(String[] args) {

        List<String> collection = new ArrayList<>();
        collection.add("Python");
        collection.add("Python");
        //collection.add("Python");
        System.out.println(collection);

        for (String elem: collection) {
            collection.remove(elem);
        }

        System.out.println(collection);
    }
}
