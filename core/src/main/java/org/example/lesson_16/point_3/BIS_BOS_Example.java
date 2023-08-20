package org.example.lesson_16.point_3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BIS_BOS_Example {

    public static void main(String[] args) {
        bis();
    }


    private static void bos(){
        String message = "ekfekf";
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            baos.write(message.getBytes());
            byte[] bytes = baos.toByteArray();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void bis(){
        byte[] arrray = {12,12,12,23,5,6,4};
        try(ByteArrayInputStream bais = new ByteArrayInputStream(arrray)){
            for (byte elem : arrray) {
                char data = (char) bais.read();
                System.out.println(data);
            }
        } catch (IOException e){
            e.getMessage();
        }
    }
}
