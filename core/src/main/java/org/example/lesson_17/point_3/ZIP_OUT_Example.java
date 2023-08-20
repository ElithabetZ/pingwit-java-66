package org.example.lesson_17.point_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZIP_OUT_Example {

    private static final String PATH = "src/main/java/org/example/lesson_17/point_3/song.txt";

    public static void main(String[] args) {
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(PATH)))
            {
                ZipEntry zisEntry;
                String name;
                long size;
            while((zisEntry = zis.getNextEntry()) != null){
                name = zisEntry.getName();
                size = zisEntry.getSize();
                System.out.printf("File name is: %s  File size: %d", name, size);

                FileOutputStream fos = new FileOutputStream("src/main/java/org/example/lesson_17/point_3/"+name);
                for(int i = zis.read(); i != -1; i = zis.read()){
                    fos.write(i);
                }
                fos.flush();
                zis.closeEntry();
                fos.close();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
