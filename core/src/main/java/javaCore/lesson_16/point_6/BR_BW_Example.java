package javaCore.lesson_16.point_6;

import java.io.*;

public class BR_BW_Example {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("console.txt"))){

            String text;
            while(!(text = br.readLine()).equals("ESC")){
                bw.write(text + "\n");
                bw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
