package org.example.lesson_22.home_work_22.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Написать функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 рублей.
Если получится, то учесть правильность окончаний, если нет, то можно сократить до "руб".
 */
//как-то все слишком сложно...
//Ожидалось что-то типо такого:
//Parse parse = integer -> integer + " RUB";
//String result = showRUB(parse, 4);
//System.out.println(result);
public class MoneyCount {
    public static void main(String[] args) {
        int userNumber = getNumebr();

        IntegerIntoString operation = number -> {
            String amount;
            List<Integer> exeptionNumbersTwoDigit = new ArrayList<>();
            for (int i = 1; i < 9; i++) {
                exeptionNumbersTwoDigit.add(10 + i);
            }
            List<Integer> exeptionNumbersOneDigit = new ArrayList<>();
            for (int i = 1; i < 5; i++) {
                exeptionNumbersOneDigit.add(i);
            }

            if (exeptionNumbersTwoDigit.contains(number) || exeptionNumbersTwoDigit.contains(number % 100)) {
                amount = number + " рублей";
            } else if (number % 10 == 1) {
                amount = number + " рубль";
            } else if (exeptionNumbersOneDigit.contains(number) || exeptionNumbersOneDigit.contains(number % 10)) {
                amount = number + " рубля";
            } else {
                amount = number + " рублей";
            }
            return amount;
        };

        System.out.println(operation.toString(userNumber));
    }

    public static int getNumebr(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста введи челочисленное значение сколько у тебя рублей");
        int amount = scan.nextInt();
        return amount;
    }
}


