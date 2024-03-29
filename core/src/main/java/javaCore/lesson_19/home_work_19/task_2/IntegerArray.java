package javaCore.lesson_19.home_work_19.task_2;

import java.util.ArrayList;
import java.util.Iterator;

/*
Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и выведите на экран.
Затем удалите из него все четные элементы. И снова выведите на экран
 */
public class IntegerArray {

    public static void main(String[] args) {
        //List
        ArrayList<Integer> array = new ArrayList<>();
        fillArrayList(array);
        System.out.println(array);
        removeAllEven(array);
        System.out.println(array);
    }
    //initListWithNumbers
    public static void fillArrayList(ArrayList<Integer> array) {//List
        for (int i = 1; i <= 100; i++) {
            array.add(0, i);
        }
    }
    //+
    public static void removeAllEven(ArrayList<Integer> array){
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
