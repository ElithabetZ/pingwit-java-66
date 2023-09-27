package javaCore.lesson_15.point_3;

public class ThrowExample {

    public static void main(String[] args) {
        ex1();
    }


    static void ex1() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e){
            throw new RuntimeException("sss", e.getCause());
        }
    }
}
