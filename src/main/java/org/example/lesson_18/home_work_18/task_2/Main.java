package org.example.lesson_18.home_work_18.task_2;

public class Main {

    public static void main(String[] args) {
        Garage garageBMW = new Garage<BMW>(new BMW[]{new BMW(1987), new BMW(2003)}, "Mike");
        System.out.println("BMW Garage " + garageBMW);
        Garage garageLada = new Garage<Lada>(new Lada[]{new Lada(2005), new Lada(1890)}, "Luiza");
        System.out.println("Lada garage " + garageLada);
        Garage garageAll = new Garage<>(new Car[]{new Lada(1856), new BMW(2000)}, "Luke");
        System.out.println("BMW + Lada garage " + garageAll);
    }
}
