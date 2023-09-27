package javaCore.lesson_16.point_1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOS_Example {

    private static final String FILE_INPUTNAME = "Tut srazu";

    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream(FILE_INPUTNAME)){
            fos.write("Hellllo".getBytes());
            fos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
