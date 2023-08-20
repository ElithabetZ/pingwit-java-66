package org.example.lesson_18.home_work_18.task_1;

public class Main {

    public static void main(String[] args) {
        UnknownArgument<String> arg = new UnknownArgument<>("Mike");
        System.out.println(arg.getArgType());
    }
}
