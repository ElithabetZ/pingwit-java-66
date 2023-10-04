package org.example.project_filmsOnlineReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connection {

    private static final String FILE_PATH_IN = "core/src/main/java/org/example/lesson_27/home_work_27/task_2/films.txt";
    private static List<String> attribute = Arrays.asList("Страна:", "Жанр:", "Продолжительность:", "Качество:", "IMDB", "Год выпуска:");
    private static String url = "https://kinogo.biz";
    private static String mainDiv = "div[id=dle-content]";
    private static String elemDiv = "div.shortstory";
    private static String titleDiv = "div.shortstory__title h2";
    private static String attrDiv = "div.shortstory__info-wrapper div span";
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Document document = Jsoup.connect(url).get();
        Elements body = document.select(mainDiv);
        List<Film> films = new ArrayList<>();
        films = getFilms(body, films);

        File file = new File(FILE_PATH_IN);
        objectMapper.writeValue(file,films);

        films.forEach(System.out::println);
    }

    public static List<Film> getFilms(Elements body, List<Film> films){
        for (Element element: body.select(elemDiv)) {
            Film film = new Film();
            String title = element.select(titleDiv).text();
            film.setName(title);
            fillMainAttributes(element,film, attribute);
            films.add(film);
        }
        return films;
    }

    public static void fillMainAttributes(Element element, Film film, List<String> attribute){
        int index = 0;
        String text = element.select(attrDiv).text();
        String emptyMessage = "Haven't got such information";
        for (String attr: attribute) {
            try{
                switch (attr){
                case "Страна:" -> film.setReleaseYear(Integer.parseInt(text.substring(index, text.indexOf(attr)).replace("Год выпуска:","").trim()));
                case "Жанр:" -> film.setCountry(text.substring(index, text.indexOf(attr)));
                case "Продолжительность:" -> film.setGenre(text.substring(index, text.indexOf(attr)));
                case "Качество:" -> film.setLasting(text.substring(index, text.indexOf(attr)).replace("Премьера (РФ):Неизвестно ",""));
                case "IMDB" -> film.setQuality(text.substring(index, text.indexOf(attr)));
                case "Год выпуска:" -> film.setImdbRate(text.substring(index));
                }
                index = text.indexOf(attr);
            } catch (StringIndexOutOfBoundsException e){
                switch (attr){
                    case "Страна:" -> film.setReleaseYear(0);
                    case "Жанр:" -> film.setCountry(emptyMessage);
                    case "Продолжительность:" -> film.setGenre(emptyMessage);
                    case "Качество:" -> film.setLasting(emptyMessage);
                    case "IMDB" -> film.setQuality(emptyMessage);
                    case "Год выпуска:" -> film.setImdbRate(emptyMessage);
                }
            }
        }
    }
}
