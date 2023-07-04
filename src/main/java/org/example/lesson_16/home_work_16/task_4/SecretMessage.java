package org.example.lesson_16.home_work_16.task_4;

import java.io.*;

/*
Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
Затем это сообщение нужно прочитать из файла и вывести на экран
 */
public class SecretMessage {

    private static final String FILE_PATH = "src/main/java/org/example/lesson_16/home_work_16/task_4/photo_2023-07-04_21-07-27.jpg";
    public static void main(String[] args) {
            writeSecretMessage(FILE_PATH);
            readSecretMessage(FILE_PATH);
        }

        public static void writeSecretMessage(String pass){
            try (FileWriter fw = new FileWriter(pass, true)) {
                fw.write("\n");
                fw.write("Secret Message");
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void readSecretMessage(String pass){
            try(BufferedReader br = new BufferedReader(new FileReader(pass))){
                String line;
                while ((line = br.readLine()) != null){
                    if(line.equals("Secret Message")) {
                        System.out.println(line);
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
}
