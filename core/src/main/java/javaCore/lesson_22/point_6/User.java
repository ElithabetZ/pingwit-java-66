package javaCore.lesson_22.point_6;

public record User(String name, Integer age) {

    public User(){
        this("Default", 22);
    }
    public User(String name, Integer age){
        this.age = age;
        this.name = name;
    }
}
