package org.example.lesson_14.point_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class JavaDateExamples {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        int year = now.getYear();
        Month month = now.getMonth();
        now.getDayOfMonth(); // какой день в текущем месяце
        now.getMonthValue();

        LocalDate myTime = LocalDate.of(2023, 1, 23);
        LocalDate plusYearDate = myTime.plusYears(4);
        LocalDate plusMonthDate = myTime.plusDays(4);


        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        System.out.println(availableZones);

        System.out.println(nowTime.atZone(ZoneId.of("Europe/Warsaw")));

        DateTimeFormatter off = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String format = off.format(now);
        System.out.println(format);

        LocalDate parse = LocalDate.parse("26-cze-2023", off);
        System.out.println(parse);

        DateTimeFormatter dtfForLocalDate = DateTimeFormatter.ofPattern("MM-dd-yyyy 'at' HH::mm::ss");
        System.out.println(dtfForLocalDate.format(LocalDateTime.now()));
    }
}
