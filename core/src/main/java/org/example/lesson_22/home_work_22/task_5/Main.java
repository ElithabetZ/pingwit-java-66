package org.example.lesson_22.home_work_22.task_5;

import java.util.ArrayList;
import java.util.List;

/*
Есть класс Sportsman, у которого есть поля имя и скорость, с которой он бежит, а также коллекция медалей.
Медаль содержит информацию о номере забега и место.
Создать спортсменов, которые будут участвовать в забеге.
Дистанция - 600м. Отфильтровать тех, кто пробежал медленнее всех, а первым трем вручить медали - золото, серебро и бронзу (enum).

 */
// посмотрим
public class Main {
    public static void main(String[] args) {
        int kmRace = 600;
        Sportsman mike = new Sportsman("Mike", 1.3f);
        Sportsman liza = new Sportsman("Liza", 4f);
        Sportsman anna = new Sportsman("Anna", 3.3f);
        Sportsman luka = new Sportsman("Luka", 2.3f);

        List<Sportsman> list = new ArrayList<>();
        list.add(mike);
        list.add(liza);
        race(list, kmRace);
        SporstmanComparator comp = new SporstmanComparator();
        list.sort(comp);
        System.out.println(list);

    }

    public static void race(List<Sportsman> list, int kmRace) {

        for (Sportsman sportsman : list) {
            sportsman.setCurrentResult(sportsman.getSpeed() * kmRace);
        }
    }
}
