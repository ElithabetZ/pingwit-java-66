package org.example.lesson_16.point_4;

import java.io.*;

public class DOS_Example {

    private static final String FILE_PASS = "morkor";
    public static void main(String[] args) {
        dos();
        dis();
    }

    private static void dos(){
        try(FileOutputStream fos = new FileOutputStream(FILE_PASS);
            DataOutputStream dos = new DataOutputStream(fos)){

            dos.writeBoolean(true);
            dos.writeFloat(1.16f);

            dos.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void dis(){
        try(FileInputStream fis = new FileInputStream(FILE_PASS);
            DataInputStream dis = new DataInputStream(fis)){

            boolean bool = dis.readBoolean();
            System.out.println(bool);
            float fl = dis.readFloat();
            System.out.println(fl);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
