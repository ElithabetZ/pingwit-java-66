package javaCore.lesson_7;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(false);
        User user2 = new User(true);

        Car car = new Car(13, "BMV");
        if(user1.isAllowed()){
            car.setModel("Win");
        }
    }
}
