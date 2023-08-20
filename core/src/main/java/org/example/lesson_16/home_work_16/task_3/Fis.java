package org.example.lesson_16.home_work_16.task_3;

import java.io.FileInputStream;
import java.io.IOException;
/*
Есть некоторый текст, его нужно записать в файл. Можно использовать одно и то же предложение, запишите его 1000 раз
Прочитать файл из Task_2 и вывести на экран содержимое
 */
//+ Но лучше и буферы для оптимизации было использовать
public class Fis {

private static final String FILE_NAME = "src/main/java/org/example/lesson_16/home_work_16/task_2/1000times.txt";
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(FILE_NAME)){
            int data;
            while((data = fis.read()) != -1){
                System.out.print((char) data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
