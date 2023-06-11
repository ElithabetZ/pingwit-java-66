package org.example.lesson_8.home_work_8;

import java.util.Arrays;
import java.util.Scanner;

public class Palidrom {
    public static void main(String[] args) {
        String word = getWord();
        word = word.toLowerCase();
        char[] wordChar = word.toCharArray();
        char[] versaChar = swap(wordChar);
        String versaWord = new String(versaChar);
        isItPalindrom(word, versaWord);
    }

    public static char[] swap(char[] wordChar)
    {
        char[] versaChar = wordChar.clone();
        int index = versaChar.length / 2;
        int iteration = 1;
        char tempor;
        for(int i = 0; i < index; i++)
        {
            tempor = versaChar[i];
            versaChar[i] = versaChar[versaChar.length - iteration];
            versaChar[versaChar.length - iteration] = tempor;
            iteration++;
        }
        return versaChar;
    }

    static void isItPalindrom(String word, String versaWord)
    {
        boolean isItPalindrom;
        isItPalindrom = word.equals(versaWord);
        if(isItPalindrom) {
            System.out.println("Yes, this word is a Palindrom");
        } else {
            System.out.println("No, it's not a Palindrom");
        }
    }

    public static String getWord()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the word which you want to check for palindromism");
        String word = scan.nextLine();
        return word;
    }

}
