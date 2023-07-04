package org.example.lesson_16.home_work_16.task_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/*
Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл
 */
public class ArrayOutput {

    private static final String PATH = "src/main/java/org/example/lesson_16/home_work_16/task_1/array.txt";

    public static void main(String[] args) {
        int[] array = {12, 45, 56, 85, 55};

        try (FileOutputStream fos = new FileOutputStream(PATH);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            String textArray = Arrays.toString(array);
            bos.write(textArray.getBytes());

            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
