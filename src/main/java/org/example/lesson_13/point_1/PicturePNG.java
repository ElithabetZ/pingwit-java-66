package org.example.lesson_13.point_1;

public class PicturePNG extends AbstractPictire{

    public PicturePNG(double width){
        super(width);
    }

    @Override
    public double getWidth(){
        System.out.println("Inside PicturePNG");
        return width*20;
    }

    @Override
    public PictureType getPictureType() {
        return PictureType.NPG;
    }
}
