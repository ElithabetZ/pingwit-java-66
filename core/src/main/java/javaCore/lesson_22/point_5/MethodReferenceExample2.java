package javaCore.lesson_22.point_5;

import java.util.List;

interface Printer2{
    void print(MethodReferenceExample2.Person person);
}
public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Masha", "1"),
                new Person("Kate", "2"),
                new Person("Oleg", "3")
                );

    }

    public static void printPerson(List<Person> people, Printer2 printer2){
        for(Person person: people){
            printer2.print(person);
        }
    }
    record Person(String name, String surname){

    };
}
