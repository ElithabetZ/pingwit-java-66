package org.example.lesson_16.home_work_16.task_2;

import java.io.FileWriter;
import java.io.IOException;
/*
Есть некоторый текст, его нужно записать в файл. Можно использовать одно и то же предложение, запишите его 1000 раз
 */
public class FWE {

private static final String FILE_PATH = "src/main/java/org/example/lesson_16/home_work_16/task_2/1000times.txt";
    public static void main(String[] args) {
        //для каждого for у тебя try. Достаточно одного try и в нем уже for
        for (int i = 1; i < 1000; i++) {
            try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
                fw.write("\n");
                fw.write("to be continiued...");

                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
