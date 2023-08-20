package org.example.lesson_8.home_work_8;

public class Warehouse {
    private Box[] boxes;
    private int index;


    public Warehouse(Box[] boxes){
        this.boxes = boxes;
        this.index = 0;
    }

    public Box[] getBoxes(){return boxes.clone();}

    public Box next(){
        if(index == (boxes.length-1)){
            //тогда индекс должен снова стартануть с 0. index = 0;
            return boxes[0];
        } else {
        Box example = boxes[++index];
        return example;
        }
    }
}
