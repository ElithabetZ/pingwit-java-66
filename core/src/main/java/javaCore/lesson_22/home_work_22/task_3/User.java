package javaCore.lesson_22.home_work_22.task_3;
//+
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
