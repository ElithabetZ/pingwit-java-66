package musicApp.dto;

import java.util.List;

public record ArtistResponseDto(long id, String name, String dateOfConcert, List<SongDto> songs) {
}
