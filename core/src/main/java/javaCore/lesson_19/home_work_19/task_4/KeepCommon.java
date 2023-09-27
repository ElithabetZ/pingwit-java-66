package javaCore.lesson_19.home_work_19.task_4;

import java.util.ArrayList;
/*
Есть две коллекции, нужно оставить в первой только те, которые есть во второй
 */
//+
public class KeepCommon {

    public static void main(String[] args) {
        ArrayList<String> langToStart = new ArrayList<>();
        String[] arrayLangToStart = {"SQl", "Java", "Python", "JavaScript"};
        fillArray(arrayLangToStart, langToStart);
        System.out.println("Languages to start with: " + langToStart);

        ArrayList<String> langToBegin = new ArrayList<>();
        String[] arrayLangToContiniu = {"SQl", "Java", "Python", "C++", "C#", "Swift"};
        fillArray(arrayLangToContiniu, langToBegin);
        System.out.println("Languages to continui with: " + langToBegin);

        deleteUncommonElements(langToBegin, langToStart);
        System.out.println("Languages after delete: " + langToBegin);
    }

    public static void fillArray(String[] arrayOfString, ArrayList<String> array) {
        for (String name : arrayOfString) {
            array.add(name);
        }
    }

    public static void deleteUncommonElements(ArrayList<String> array, ArrayList<String> arrayToKeep){
        ArrayList<String> cont = new ArrayList<>();
        cont.addAll(array);
        cont.removeAll(arrayToKeep);
        array.removeAll(cont);
    }
}
