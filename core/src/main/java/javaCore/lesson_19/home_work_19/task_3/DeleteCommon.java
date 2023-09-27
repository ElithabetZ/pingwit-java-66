package javaCore.lesson_19.home_work_19.task_3;

import java.util.ArrayList;

/*
Есть две коллекции, нужно удалить из первой те, которые есть во второй
 */
public class DeleteCommon {

    public static void main(String[] args) {
        //List
        ArrayList<String> langToStart = new ArrayList<>();
        String[] arrayLangToStart = {"SQl", "Java", "Python"};//можно сразу в list, но так красивей, понимаю:) Почитай про List.of
        fillArray(arrayLangToStart, langToStart);
        System.out.println("Languages to start with: " + langToStart);

        ArrayList<String> langToContiniu = new ArrayList<>();
        String[] arrayLangToContiniu = {"SQl", "Java", "Python", "C++", "C#", "Swift"};
        fillArray(arrayLangToContiniu, langToContiniu);
        System.out.println("Languages to continui with: " + langToContiniu);

        langToContiniu.removeAll(langToStart);
        System.out.println("Languages after delete: " + langToContiniu);
    }

    public static void fillArray(String[] arrayOfString, ArrayList<String> array) {
        for (String name : arrayOfString) {
            array.add(name);
        }
    }
}

