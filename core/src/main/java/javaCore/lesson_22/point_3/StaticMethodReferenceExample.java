package javaCore.lesson_22.point_3;

import java.util.List;

@FunctionalInterface
interface Printer{
    void print(String name);
}
public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Mary", "Kate");
        printNames(names, StaticMethodReferenceExample::printName);
        printNames(names, (name) -> printName(name));
    }

    public static void printNames(List<String> names, Printer printer){
        for(String name: names){
            printer.print(name);
        }
    }
    public static void printName(String name){
        System.out.println(name);
    }
}
