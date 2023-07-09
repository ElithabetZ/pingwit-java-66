package org.example.lesson_17.point_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File_Exampl {

    private static final String FILE_PATH = "src/main/java/org/example/lesson_17/point_2/data.txt";
    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        try {
            file.createNewFile();


            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write("Data");
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }


        String data = Files.readString(Path.of(FILE_PATH));
        System.out.println(data);


    }
}
