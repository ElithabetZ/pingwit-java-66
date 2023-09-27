package javaCore.lesson_19.home_work_19.task_1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Вход на вечеринку только по списку.
Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
после чего говорит может он пройти или нет
 */
public class PartyList {

    public static void main(String[] args) {
        //может List использовать?)
        String[] partyNames = {"Mike", "Anne", "Luke", "Grage"};
        //List<String>
        ArrayList<String> partyList = new ArrayList<>();
        fillListOfGuests(partyNames, partyList);
        String name = getName();
        if (checkName(name, partyList)) {
            System.out.println("Come in!");
        } else {
            System.out.println("You are not invited!");
        }
    }

    public static boolean checkName(String name, ArrayList<String> list) {
        boolean isInList = false;
        if (list.contains(name)) {
            isInList = true;
        }
        return isInList;
    }

    public static void fillListOfGuests(String[] listOfGuests, ArrayList<String> partyList) {
        for (String name : listOfGuests) {
            partyList.add(name);
        }
    }

    public static String getName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, type your name: ");
        String name = scan.next();
        return name;
    }
}
