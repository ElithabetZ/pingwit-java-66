package javaCore.lesson_19.point_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (Integer elem: nums) {
            System.out.println(elem);
        }

        Iterator<Integer> iterator = nums.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next % 2 != 0){
                iterator.remove();
            }
        }

        System.out.println(nums);
    }
}
