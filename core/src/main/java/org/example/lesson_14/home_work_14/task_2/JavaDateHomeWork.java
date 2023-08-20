package org.example.lesson_14.home_work_14.task_2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
/*
Мировые часы.
Пользователь вводит время с указанием тайм зоны, а программа выдает ему сколько сейчас времени в других городах.
Например, 15.00 Europe/Warsaw:
- Анкара 17.00
- Лондон 14.00
и т.д. Города выберите сами.
 */
public class JavaDateHomeWork {
    public static void main(String[] args) {
        //у тебя сканнер создается 2 раза в каждом из методов. Создай его здесь и просто передавай в параметрах
        LocalDateTime userTime = LocalDateTime.of(getDate(), getTime());
        ZonedDateTime outputTimeOne = userTime.atZone(ZoneId.of("America/Marigot"));
        System.out.println(outputTimeOne + " now in America/Marigot");
        ZonedDateTime outputTimeTwo = userTime.atZone(ZoneId.of("Europe/London"));
        System.out.println(outputTimeTwo + " now in Europe/London");
    }

    public static LocalTime getTime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type your hours");
        int hours = scan.nextInt();
        System.out.println("Please, type your minutes");
        int minutes = scan.nextInt();
        LocalTime userTime = LocalTime.of(hours,minutes);
        return userTime;
    }

    public static LocalDate getDate(){
        Scanner scan = new Scanner(System.in);
        Instant instant = Clock.systemDefaultZone().instant();
        System.out.println("Please, type your time zone");
        String zone = scan.next();
        ZoneId zoneId = ZoneId.of(zone);
        LocalDate date = LocalDate.ofInstant(instant, zoneId);
        return date;
    }
}
