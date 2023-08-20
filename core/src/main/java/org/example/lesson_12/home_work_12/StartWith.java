package org.example.lesson_12.home_work_12;

import java.util.Arrays;

/*
Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
 */
public class StartWith {
    public static void main(String[] args) {
        String[] words = {"fellfe", "fneirjnfier", "wodmpwfn", "fhieufberi", "wdm,welnferk", "Wliqnfowgnor" };
        //не надо заводить 2 переменные. Сравнивать только с 1 (использовать либо toLowerCase(), либо upper)
        String letterUpper = "W";
        String letterLowwer = "w";
        System.out.println(Arrays.toString(findWords(words, letterUpper, letterLowwer)));
    }

    //соответственно тут будут только 2 параметра
    public static String[] findWords(String[] words, String letterUp, String letterLow) {
        String[] temArray = new String[words.length];
        int howManyWords = 0;//не очень нейминг. Лучше wordsCouter либо просто couter, т.к по названию метода и так понятно, что words
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(letterUp)) {
                temArray[howManyWords] = words[i];
                howManyWords++;
            } else if (words[i].startsWith(letterLow)) {
                temArray[howManyWords] = words[i];
                howManyWords++;
            }
        }
        String[] arrayOfWords = new String[howManyWords];
        for (int i = 0; i < howManyWords; i++) {
            arrayOfWords[i] = temArray[i];
        }
        return arrayOfWords;
    }
}
