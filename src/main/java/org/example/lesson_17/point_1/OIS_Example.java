package org.example.lesson_17.point_1;

import java.io.*;

public class OIS_Example {

    private static final String FILE_PATH = "src/main/java/org/example/lesson_17/point_1/object";

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
             Person person = (Person) ois.readObject();

            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
