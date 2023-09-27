package javaCore.lesson_9.home_work_9.task_3;
//ты все смешала в 1 класс. Подразумевалось создать несколько - Car, Transmission, Engine. Ведь это разные сущности.
public class Car {
    private String name;
    private int year;
    private boolean motor;
    private int transmission;
    private int maxTransmission = 7;
    private int minTransmission = 0;
    private int speed = 20;

    public Car(String name, int year)
    {
        this.name = name;
        this.year = year;
        this.motor = false;
        this.transmission = 0;
    };

    public void motorOn() {
        if (this.motor) {
            System.out.println("Motor is already on");
        } else {
            this.motor = true;
        }
    };

    public void motorOff() {
        if (this.motor) {
            this.motor = false;
        } else {
            System.out.println("Motor is already off");
        }
    };

    public void upshift() {
        if (this.transmission == maxTransmission) {
            System.out.println("You can't drive faster");
        } else {
            this.transmission++;
        }
    };

     public void downshift() {
        if (this.transmission == minTransmission) {
            System.out.println("You can't drive slower");
        } else {
            this.transmission--;
        }
    };

    public void drive() {
        if (this.motor) {
            System.out.println("Your speed is " + (this.transmission * speed));
        } else {
            System.out.println("First turn on motor");
        }
    };

}
