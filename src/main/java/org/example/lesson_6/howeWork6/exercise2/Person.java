package org.example.lesson_6.howeWork6.exercise2;

/*
Создайте класс, у которого будут поля имя и возраст.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста.
Добавьте в класс блок инициализации, который будет выводить на экран сообщение о том, что создали новый экземпляр класса.
 */
public class Person {
    String name;
    int age;
    public static String text = "Hello from static";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "Default";
        this.age = 10;
    }

    {
        System.out.println("New instance!!!");
    }

    static {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + text;
    }
}
