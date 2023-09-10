package org.example.lesson_29.home_work.task_2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
/*
    Да, ты получаешь информацию в типе String. Но хранить так - неправильно. А что, если тебе ее надо будет как-то обрабатывать?
    Сделай, например, обертку. Пару вариантов:
    1) когда забираешь поле, то сразу же делай парсинг (например если это дата, то DateTimeFormatter и т.п);
    2) создай отдельный класс, например, RawForecast (с такими же полями как у тебя сейчас). Но затем перед выводом создавай Forecast 
с парсированными полями. Для этого можешь придумать отдельный сервис и назвать его ForecastBuilder, например.
*/
//это не Service, а больше какой-то ForecastParser, ForecastLoader, ForecastBuilder и т.п
public class ForecastService implements Runnable {
    private String city;
    private static String url = "https://www.meteoprog.pl/en/weather/";
    private static String bodySection = "article";

    public ForecastService(String city) {
        this.city = city;
    }

    @Override
    public void run() {
        if (connection(city) != null) {
            Elements body = connection(city).select(bodySection);
            Forecast forecast = new Forecast();
            setMainInfo(body, forecast);
            setAdditInfo(body, forecast);
            //https://www.youtube.com/watch?v=umDr0mPuyQc
            System.out.println(forecast);
            /*
                такое может испоьзоваться только в тестовых целях. Что произойдет с объектом? Ты его потеряешь навсегда!
                А что если ты хочешь хранить статистику погоды за месяца, года. Делать какие-то выборки и многое-многое другое?
                --
                сделай с Callable лучше, а в Main уже можешь выводить
            */
        }
    }

    public Document connection(String city) {
        Document document = null;
        try {
            document = Jsoup.connect(url + city + "/").get();
        } catch (IOException i) {
            //для вывода ошибок в консоли System.err 
            так как коннекшен тут - самое ключевое
            System.out.println("Oppps, please, check " + city + " name:)");
        }
        return document;
    }

    public void setMainInfo(Elements body, Forecast forecast) {
        //вынеси все "h1", "h2" и т.п в константы с осмысленными именами. Можешь для этого отдельный класс завести - MeteoprogConstant (или что-то подобное)
        forecast.setName(body.select("h1").text());
        forecast.setCurDate(body.select("h2").first().text());
        forecast.setCurTem(body.select("div.today-temperature span").text());
        forecast.setCurFeels(body.select("span.feels-like b").text());
        forecast.setCurCloud(body.select("div.icons").attr("title"));
    }

    public void setAdditInfo(Elements body, Forecast forecast) {
        List<String> temp = body.select("ul.today-hourly-weather.hide-scroll li").eachText();
        List<String> additInfo = body.select("table tr").eachText();

        //отдельный метод
        for (String line : temp) {
            if (line.startsWith("Day")) {
                forecast.setDayTemp(line);
            } else if (line.startsWith("Night")) {
                forecast.setNightTemp(line);
            }
        }

        //отдельный метод
        for (String line : additInfo) {
            if (line.startsWith("Chance")) {
                forecast.setChanceOfPrecipition(line);
            } else if (line.startsWith("UV")) {
                forecast.setUvIndex(line);
            }
        }
    }
}
