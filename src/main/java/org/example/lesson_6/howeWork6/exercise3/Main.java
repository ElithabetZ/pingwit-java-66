package org.example.lesson_6.howeWork6.exercise3;

import org.example.lesson_6.howeWork6.exercise2.Person;

import java.util.Arrays;
import java.util.Scanner;

/*
Создайте массив, состоящий из объектов класса из 'Task 2'. Выведите полученный массив на экран, должны отображаться
названия полей класса и их значения.
 */
public class Main {
    public static void main(String[] args) {
        int lenght = findHowManyIterations();
        String[] array = new String[lenght];
        int iteraton = 0;
        while (iteraton < lenght) {
            array[iteraton] = getPerson();
            iteraton++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int findHowManyIterations() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many person do you want to add?");
        int lenght = scan.nextInt();
        return lenght;
    }

    public static String getPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type name of the person");
        String name = scan.next();
        System.out.println("Type age of the person " + name);
        int age = scan.nextInt();
        Person person = new Person(name, age);
        String object = person.toString();
        return object;
    }
}
