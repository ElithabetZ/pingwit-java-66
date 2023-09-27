package javaCore.lesson_16.point_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {


    private static final String FILE_PASS = "mcerkvmerl";
    public static void main(String[] args) {
        try(FileReader fr = new FileReader(FILE_PASS);
            BufferedReader br = new BufferedReader(fr)){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
