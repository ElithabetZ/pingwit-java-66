package javaCore.lesson_6.howeWork6.exercise4;

import javaCore.lesson_6.howeWork6.exercise2.Person;

/*
Классу из 'Task 2' добавьте статическое приватное поле text = "Hello from static".
В другом классе, с методом main создайте несколько экземпляров класса из 'Task 2'. В одном из экземпляров измените значение
поля 'text' и затем выведите на экран поле 'text' у всех созданных объектов.
Если результат вас удивил, пересмотрите лекцию про static поля в классах
 */
public class Main {
    public static void main(String[] args) {
        Person.text = "Hello";
        Person tim = new Person("Tim", 11);
        System.out.println(tim);
        Person tom = new Person("Tom", 25);
        System.out.println(tom);
        Person lily = new Person("Lily", 18);
        System.out.println(lily);

    }
}
