package javaCore.lesson_28.point_1;

public class Main {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("current");
        System.out.println(thread);
        thread.setPriority(7);
        System.out.println(thread);

    }
}
