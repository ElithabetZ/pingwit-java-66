package org.example.lesson_12.home_work_12;

/*
Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.
 */
public class WordGame {
    public static void main(String[] args) {
        String str = "engineering";
        String engine = str.substring(0, 6);
        String ring = str.substring(7);
        System.out.println(str + " разделяется на: " + engine + " и " + ring);
    }
}
