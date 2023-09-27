package javaCore.lesson_29.home_work.task_2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Так как это задание охватывает весь Java Core, то я бы рекоммендовала:
    1. Добавить больше StreamAPI, например, помимо вывода Forecast выводить какую-то статистику:
        1.1 Города с температурой ниже введенной пользователем
        1.2 посчитать среднюю, максимальную и т.д и т.п информацию
     Да, тебе тут надо будет дождаться ответа от потоков (Callable: isDone())
    2. Добавь интерфейсы, абстракцию. Например, что мне предложил Chat GPT и я рекоммендую это сделать:
        2.1 ForecastDataProvider Interface:
            Create an interface called ForecastDataProvider that defines a contract for classes that provide forecast data. 
            It can include methods like getForecasts(). 
            Implement this interface in different classes that retrieve forecast data from various sources (e.g., file, API, database) Ты используешь, например, API (website).
            This abstraction allows you to switch between different data providers without affecting the rest of the code.
    И затем это помещается в твой run (call)

        2.2 ForecastDataProcessor Interface: Define an interface called ForecastDataProcessor that represents the behavior of processing 
            forecast data. This interface can include methods like calculateStatistics(List<Forecast> forecasts) (тут ты можешь сделать все из 1 пункта и просто sout). 
            Implement this interface in classes that perform data manipulation, statistical calculations,r any other processing logic based on the forecast data.
   
    А это просто идея на будущее, сейчас уже лишнее (хотя в файл записать спокойно можешь:)):
        2.3 ForecastReportGenerator Interface: Create an interface called ForecastReportGenerator that outlines the methods 
            required to generate forecast reports. This interface should include methods like generateTextReport(String filename). 
            Implement this interface in classes responsible for generating
         
*/
public class Main {
    public static void main(String[] args) {
        String[] cities = getUserCities().split(" ");
        int numberOfCities = cities.length;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfCities);
        //Попробуй StreamAPI
        for (int i = 0; i < numberOfCities; i++) {
            ForecastService forecastService = new ForecastService(cities[i]);
            executorService.submit(forecastService);
        }
        executorService.shutdown();
    }

    //я бы создала отдельный интерфейс, например CitiesProvider: List<String> getUserCities();
    //Затем class ConsoleCitiesProvider
    //А потом может у тебя и из других мест будут города приходить :)
    //и использовать этот итерфейс в public static void main : CitiesProvider provider = new ConsoleCitiesProvider();
    public static String getUserCities() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Poland Weather Application");
        System.out.println("Which city/cities weather in Poland you want to check? (Write without polish special letters)");
        String userRequest = scan.nextLine();
        userRequest.trim();
        return userRequest;
    }
}
