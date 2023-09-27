package javaCore.lesson_8.home_work_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = {
          new Box("One", 256),
          new Box("Two", 699),
          new Box("Three", 9647),
          new Box("Four", 488)
        };

        Warehouse warehouse = new Warehouse(boxes);
        Box[] array = warehouse.getBoxes();
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < boxes.length; i++) {
            System.out.println(warehouse.next());
        };
    }
}
