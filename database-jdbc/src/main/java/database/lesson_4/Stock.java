package database.lesson_4;

import java.time.LocalDate;

public record Stock( Integer id, String ticker, String company_name, Integer year, String location, LocalDate update_date_time) {

}
