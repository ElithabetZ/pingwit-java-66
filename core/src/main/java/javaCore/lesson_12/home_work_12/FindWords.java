package javaCore.lesson_12.home_work_12;

import java.util.Arrays;

/*
Есть текст:
“While major gameplay components are already in place and functioning,
players help is needed to add some of the smaller features and content.
Of course polishing the overall experience is important at the same time.
Game has been extensively tested in closed group, but it is always important to hear fresh suggestions
from larger crowd that come from various gaming backgrounds.
Plan is to make the game as good as possible but without compromising the core idea.”

Нужно узнать содержит ли текст слова “alert”, “add”, “good”, “plan” и какое кол-во.
 */
//+
public class FindWords {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";
        String[] words = {"alert", "add", "good", "plan" };
        for (int i = 0; i < words.length; i++) {
            findWord(words[i], text);
        }
    }

    public static void findWord(String word, String text) {
        int howManyWords = 0;//нейминг
        if (text.contains(word)) {
            //отличная идея!
            String[] words = text.split(word);
            howManyWords = (words.length - 1);
            System.out.println("This word " + word + "appears " + howManyWords + " times in this sentence");
        } else {
            System.out.println("There isn't such word in that sentence");
        }
    }
}
