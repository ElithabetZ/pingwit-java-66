package musicApp.dto;

import musicApp.entity.Artist;
//artistID -> artistId
public record SongDto(long id, String title, long artistID) {
}
