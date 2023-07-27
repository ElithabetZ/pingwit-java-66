package org.example.lesson_21.home_work_21.task_3;

import org.example.lesson_21.home_work_21.task_1.IntegerComparator;

import java.util.*;

/*
Есть неупорядоченный склад с фруктами (допустим это List<Fruits>).
У фрукта есть название и кол-во в кг и тип (например, цитрусовые, косточковые, тропические)
Нужно произвести переучет:
- сгруппировать фрукты по типу
- посчитать вес каждого из фруктов
- отсортировать фрукты по названию
 */
public class Inventory {

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        ч(fruits);
        System.out.println(fruits);
        Comparator<Fruit> fruitNameComparator = new FruitNameComparator();
        Set<Fruit> inventoryFruits = new TreeSet<>(fruitNameComparator);
        groupFruits(fruits, inventoryFruits);
        System.out.println(inventoryFruits);
//empty lines...
//empty lines...
    }
//методы отделяются пустыми строками
    //Лучше не передавать Set, а возвращать
    //Это решение хорошее, но попробуй сделать через TreeMap
    public static void groupFruits(List<Fruit> fruits, Set<Fruit> inventoryFruits) {
        double weight;
        for (Fruit elem : fruits) {
            weight = 0;
            for (Fruit fruit : fruits) {
                if (elem.getName().equals(fruit.getName())) {
                    weight += fruit.getWeight();
                }
            }
            inventoryFruits.add(new Fruit(elem.getName(), weight, elem.getType()));
        }
    }

    //название getFruits предпологает, что ты что-то возвращаешь, а не принимаешь в параметрах и изменяешь
    public static void getFruits(List<Fruit> fruits) {
        boolean addMore = true;
        Scanner scan = new Scanner(System.in);
        while (addMore) {
            Fruit fruit = new Fruit();
            System.out.println("Please, type the name");
            fruit.setName(scan.next());
            System.out.println("Please, type the weight");
            fruit.setWeight(scan.nextDouble());
            System.out.println("Please, type which type is it? CITRUS = 1, STONE = 2, TROPICAL = 3");
            //это в отдельный метод - getFruitType, например
            switch (scan.nextInt()) {
                case 1:
                    fruit.setType(FruitType.CITRUS);
                    break;
                case 2:
                    fruit.setType(FruitType.STONE);
                    break;
                case 3:
                    fruit.setType(FruitType.TROPICAL);
                    break;
            }
            fruits.add(fruit);
            System.out.println("Do you want to add more fruits? Type for YES = 1, NO = 0");
            //можно не 0, а типо Y/N (Yes, No)
            if (scan.nextInt() == 0) {
                addMore = false;
            }
        }
    }
}
