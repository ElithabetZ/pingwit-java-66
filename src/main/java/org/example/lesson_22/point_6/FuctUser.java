package org.example.lesson_22.point_6;

@FunctionalInterface
public interface FuctUser {
    User supply(String name, Integer age);
}

class FuncConstructorExample{
    public static void main(String[] args) {
        FuctUser funUser = User::new;

        User egor = funUser.supply("Egaor", 12);
        System.out.println(egor);
    }
}
