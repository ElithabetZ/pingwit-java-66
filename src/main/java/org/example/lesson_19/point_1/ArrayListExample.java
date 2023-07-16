package org.example.lesson_19.point_1;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();

        ArrayList<String> languagesList = new ArrayList<>();

        //add
        languagesList.add("Java");
        languagesList.add("Python");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        System.out.println(languagesList);

        //size
        System.out.println(languagesList.size());

        //index(get)
        System.out.println(languagesList.get(1));

        //set(change)
        System.out.println(languagesList.set(0, "JavaScript"));
        System.out.println(languagesList);

        //remove element
        languagesList.remove(languagesList.size() - 2);
        languagesList.clear();

        //other
        System.out.println(languagesList.contains("Java"));
        System.out.println(languagesList.isEmpty());

    }
}
