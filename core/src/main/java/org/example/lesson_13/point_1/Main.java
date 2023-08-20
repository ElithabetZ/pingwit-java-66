package org.example.lesson_13.point_1;

public class Main {
    public static void main(String[] args) {
        AbstractPictire picture = generatePicture();
        double width = picture.getWidth();
        System.out.println(width);
        System.out.println(picture.getPictureType());
    }

    public static AbstractPictire generatePicture(){
        return new PicturePNG(0.7);
    }
}
