package org.example.lesson_17.home_work_17.task_2;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/*
Написать программу, которая считает сколько раз в тексте MS Word документа встретится слово.
Документ и выбор слова на ваше усмотрение.
 */
public class MicrosoftReader {

    private static final String PATH = "src/main/java/org/example/lesson_17/home_work_17/task_2/Try.docx";

    public static void main(String[] args) {
        File docs = new File(PATH);
        String word = getWord();
        int wordIteration = 0;
        try (FileInputStream fis = new FileInputStream(docs)) {
            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();
            for (XWPFParagraph doc : paragraphs) {
                wordIteration += findWord(word, doc.getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Word \"" + word + "\" appears in text " + wordIteration + " times");
    }

    public static int findWord(String word, String text) {
        int wordIteration = 0;
        if (text.contains(word)) {
            String[] words = text.split(word);
            wordIteration = (words.length - 1);
        }
        return wordIteration;
    }

    public static String getWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type which word you want to find");
        String word = scan.next();
        return word;
    }
}
