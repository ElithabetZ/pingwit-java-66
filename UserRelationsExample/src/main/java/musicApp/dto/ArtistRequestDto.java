package musicApp.dto;

import musicApp.entity.Song;

import java.util.List;

public record ArtistRequestDto(long id, String name, String dateOfConcert, List<SongDto> songs) {
}
