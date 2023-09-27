package javaCore.lesson_29.home_work.task_2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        String[] cities = getUserCities().split(" ");
        int numberOfCities = cities.length;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfCities);
        for (int i = 0; i < numberOfCities; i++) {
            ForecastService forecastService = new ForecastService(cities[i]);
            executorService.submit(forecastService);
        }
        executorService.shutdown();
    }

    public static String getUserCities() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Poland Weather Application");
        System.out.println("Which city/cities weather in Poland you want to check? (Write without polish special letters)");
        String userRequest = scan.nextLine();
        userRequest.trim();
        return userRequest;
    }
}
