package javaCore.lesson_6;

public class Main {
    public static void main(String[] args) {
        Student egor = new Student("Egor","Ex", 10);
        egor.displayInfo();
        Student.className = "Static";
        System.out.println(egor);
    }

}
