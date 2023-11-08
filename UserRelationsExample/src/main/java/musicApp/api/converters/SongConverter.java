package musicApp.api.converters;

import musicApp.dto.SongDto;
import musicApp.entity.Song;
import musicApp.service.ArtistService;
import org.springframework.stereotype.Component;

@Component
public class SongConverter {

    public final ArtistService artistService;

    public SongConverter(ArtistService artistService) {
        this.artistService = artistService;
    }

    public SongDto toDto(Song song){

        return new SongDto(song.getId(), song.getTitle(), song.getArtist().getId());
    }

    public Song toModel(SongDto dto){
        return new Song(dto.id(), dto.title(), artistService.findById(dto.artistID()));
    }
}
