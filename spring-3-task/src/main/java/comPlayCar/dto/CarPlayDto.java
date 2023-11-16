package comPlayCar.dto;

import java.time.LocalDate;

public record CarPlayDto(Long id, Long version, boolean updatable, String connection, LocalDate updatedate) {
}
