package org.example.lesson_13.point_1;

public class PictureJPEG extends AbstractPictire{

    public PictureJPEG(double width){
        super(width);
    }

    @Override
    public double getWidth(){
        System.out.println("Inside PictureJPEG");
        return width*10; // super.getWidth()*10
    }

    @Override
    public PictureType getPictureType() {
        return PictureType.JPEG;
    }
}
