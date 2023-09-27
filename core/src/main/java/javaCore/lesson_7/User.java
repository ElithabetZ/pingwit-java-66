package javaCore.lesson_7;

public class User {
    private boolean isAllow;

    public User(boolean isAllow){
        this.isAllow = isAllow;
    }

    public boolean isAllowed(){
        return isAllow;
    }
}
