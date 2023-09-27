package javaCore.lesson_16.point_5;

import java.io.FileWriter;
import java.io.IOException;

public class FWExample {

    private static final String FILE_PATH = "mcerkvmerl";

    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter(FILE_PATH, true)){
            fw.write("\n");
            fw.write("to be continiued...");

            fw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
