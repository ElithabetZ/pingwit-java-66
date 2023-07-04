package org.example.lesson_16.point_2;

import java.io.*;

public class Buff_Example {

    private static final String FILE_PASS = "mklc";
    private static final String FILE_PASS_BOS ="cnevf";

    public static void main(String[] args) {
        bos();
    }

    private static void bos(){
        String text = "mermr";
        try(FileOutputStream fos = new FileOutputStream(FILE_PASS_BOS);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
                byte[] bytes = text.getBytes();
                bos.write(bytes);
        } catch (IOException e){
            System.out.println("forfor");
        }
    }

    private static void bis(){
        try(FileInputStream fis = new FileInputStream(FILE_PASS);
            BufferedInputStream bis = new BufferedInputStream(fis)){
            int data;
            while((data=bis.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e){
            System.out.println("ncerire");
        }
    }
}
