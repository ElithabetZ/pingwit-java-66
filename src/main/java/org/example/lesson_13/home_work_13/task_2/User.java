package org.example.lesson_13.home_work_13.task_2;

//+
public class User {
    private String name;
    private int age;
    private Cart cart;

    public User(String name, int age, Cart cart){
        this.name = name;
        this.age = age;
        this.cart = cart;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cart=" + cart +
                '}';
    }

    public String getName(){
        return this.name;
    }
}
