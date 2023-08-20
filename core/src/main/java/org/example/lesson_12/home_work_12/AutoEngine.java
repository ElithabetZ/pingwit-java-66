package org.example.lesson_12.home_work_12;

import java.util.Arrays;

/*
Есть склад авто и выяснилось, что всем присвоили неверные маркировки двигателя.
Необходимо все 1.4 литра двигатели заменить на 2.0Т, а все 1.8, на 1.8Т.
 */
//тут, конечно, хотелось прям полноценно - класс автомобиля, склада
//+-
public class AutoEngine {
    public static void main(String[] args) {
        String[] engine = {"1.4", "2.5", "4.5", "6.0", "1.8", "1.4", "1.8"};
        for(int i = 0; i < engine.length; i++)
        {
            if(engine[i].equals("1.4")){
                engine[i] = engine[i].replace("1.4", "2.0T");
            } else if (engine[i].equals("1.8")) {
                engine[i] = engine[i].replace("1.8", "1.8T");
            }
        }
        System.out.println(Arrays.toString(engine));
    }
}
