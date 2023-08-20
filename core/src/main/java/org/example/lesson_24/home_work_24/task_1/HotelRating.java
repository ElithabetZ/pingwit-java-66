package org.example.lesson_24.home_work_24.task_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Есть каталог отелей, необходимо найти отель с максимальным рейтингом
 */
public class HotelRating {

    public static void main(String[] args) {
        List<Hotel> cataloge = Arrays.asList(
                new Hotel("Star", 4),
                new Hotel("Moon", 5),
                new Hotel("Shine", 3));
        //здесь просится max - hotelCatalog.stream().max(Comparator.comparingInt(Hotel::getRating))
        List<Hotel> maxRateHotel = cataloge.stream()
                .sorted(Comparator.comparing(Hotel::rage).reversed())
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(maxRateHotel);
    }
}
