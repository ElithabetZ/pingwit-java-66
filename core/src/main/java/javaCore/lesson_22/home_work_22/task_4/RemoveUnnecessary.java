package javaCore.lesson_22.home_work_22.task_4;

import javaCore.lesson_22.home_work_22.task_3.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/*
Создать метод, который бы принимал на вход List<User> и предикат, по которому все юзеры, у которых имена начинаются с A,P,E удалялись бы из этого листа
 */
//название класса не очень
public class RemoveUnnecessary {
    public static void main(String[] args) {
//пустота
        List<User> listOfUsers = new ArrayList<>();
        addNames(listOfUsers);
        System.out.println(listOfUsers);
        //можно было Predicate<String> predicate = name -> name.startsWith("A") || name.startsWith("P") || name.startsWith("P");
        /*
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (predicate.test(user.getName())) {
                iterator.remove();
            }
        }
        Так гораздо понятнее будет. У тебя все нагромождено и немного сложно для понимания
        Выноси в отдельные методы тогда уже
        */
        Predicate<List<User>> removeBuilder = list ->{
            String[] arrayExeption = {"A", "P", "E"};
            boolean isRemove = false;
            Iterator<User> iterator = list.iterator();
            while (iterator.hasNext()) {
                User next = iterator.next();
                for (String letter: arrayExeption) {
                    if(next.getName().startsWith(letter)){
                        iterator.remove();
                        isRemove = true;
                    }
                }
            }
            return isRemove;
        };
        if(removeBuilder.test(listOfUsers)){
            System.out.println("In your list were names starts with A,P,E");
        } else {
            System.out.println("Your list doesn't change");
        }
        System.out.println(listOfUsers);
    }

    public static void addNames(List<User> list){
        boolean addMore = true;
        Scanner scan = new Scanner(System.in);
        while (addMore) {
            System.out.println("Please, type the name of the user");
            list.add(new User(scan.next()));
            System.out.println("Do you want to add more fruits? Type for Y/N");
            if (scan.next().equals("N")) {
                addMore = false;
            }
        }
    }
}
