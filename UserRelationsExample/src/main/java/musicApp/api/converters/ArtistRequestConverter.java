package musicApp.api.converters;

import musicApp.dto.ArtistRequestDto;
import musicApp.entity.Artist;
import org.springframework.stereotype.Component;

@Component
public class ArtistRequestConverter {

    public final SongConverter songConverter;

    public ArtistRequestConverter(SongConverter songConverter) {
        this.songConverter = songConverter;
    }

    public Artist toModel(ArtistRequestDto dto){
        Artist artist = new Artist();
        artist.setId(dto.id());
        artist.setName(dto.name());
        artist.setDateOfConcert(dto.dateOfConcert());
        if(dto.songs()!=null){
            artist.setSongs(dto.songs().stream().map(songConverter::toModel).toList());
        }
        return artist;
    }
}
