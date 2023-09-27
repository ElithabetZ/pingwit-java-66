package javaCore.lesson_22.home_work_22.task_3;
/*
Создать класс User, сделать конструктор с 1 параметром, например, имя.
Создать функциональный интерфейс, с методом, который бы создавал юзера. Написать лямбда-выражение и создать юзера
 */
//+
public class LambdaExercise {
    public static void main(String[] args) {
//empty line
        UserBuilder userBuilder = User::new;
        User user = userBuilder.supply("Mike");
        System.out.println(user.getName());
    }
}
