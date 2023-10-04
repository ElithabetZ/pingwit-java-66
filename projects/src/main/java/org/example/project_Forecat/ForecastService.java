package org.example.project_Forecat;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

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
            System.out.println(forecast);
        }
    }

    public Document connection(String city) {
        Document document = null;
        try {
            document = Jsoup.connect(url + city + "/").get();
        } catch (IOException i) {
            System.out.println("Oppps, please, check " + city + " name:)");
        }
        return document;
    }

    public void setMainInfo(Elements body, Forecast forecast) {
        forecast.setName(body.select("h1").text());
        forecast.setCurDate(body.select("h2").first().text());
        forecast.setCurTem(body.select("div.today-temperature span").text());
        forecast.setCurFeels(body.select("span.feels-like b").text());
        forecast.setCurCloud(body.select("div.icons").attr("title"));
    }

    public void setAdditInfo(Elements body, Forecast forecast) {
        List<String> temp = body.select("ul.today-hourly-weather.hide-scroll li").eachText();
        List<String> additInfo = body.select("table tr").eachText();

        for (String line : temp) {
            if (line.startsWith("Day")) {
                forecast.setDayTemp(line);
            } else if (line.startsWith("Night")) {
                forecast.setNightTemp(line);
            }
        }

        for (String line : additInfo) {
            if (line.startsWith("Chance")) {
                forecast.setChanceOfPrecipition(line);
            } else if (line.startsWith("UV")) {
                forecast.setUvIndex(line);
            }
        }
    }
}
