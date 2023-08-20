package org.example.lesson_22.task_1;

@FunctionalInterface
public interface SimpleFuncInterface {

    void show();

    default void def1() {
        //coe
    }

    default void def2() {

    }
}

class B implements SimpleFuncInterface {
    @Override
    public void show() {
        System.out.println("Hi");
    }
}

class Demo {
    public static void main(String[] args) {
        SimpleFuncInterface sf1 = () -> System.out.println("Hi from aninimous class");
        sf1.show();
    }
}
