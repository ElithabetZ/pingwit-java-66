package musicApp.dto;

import musicApp.entity.Artist;

public record SongDto(long id, String title, long artistID) {
}
