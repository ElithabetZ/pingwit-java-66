package comPlayCar.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CarPlayDto(Long id, Long version, boolean updatable, String connection, LocalDate updatedate) {
}
