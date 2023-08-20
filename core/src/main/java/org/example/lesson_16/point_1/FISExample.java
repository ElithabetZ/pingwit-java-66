package org.example.lesson_16.point_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISExample {

    private static final String FILE_NAME = "sdewc";

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(FILE_NAME);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }
    }
}
