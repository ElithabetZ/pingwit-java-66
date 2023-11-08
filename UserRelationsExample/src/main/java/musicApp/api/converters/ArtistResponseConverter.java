package musicApp.api.converters;

import musicApp.dto.ArtistResponseDto;
import musicApp.dto.SongDto;
import musicApp.entity.Artist;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistResponseConverter {

    private final SongConverter songConverter;

    public ArtistResponseConverter(SongConverter songConverter) {
        this.songConverter = songConverter;
    }

    public ArtistResponseDto toDto(Artist artist){
        List<SongDto> songsDto;
        if(artist.getSongs()!=null){
            songsDto  = artist.getSongs().stream().map(songConverter::toDto).toList();
        } else {
            songsDto = null;
        }


        return new ArtistResponseDto(artist.getId(), artist.getName(), artist.getDateOfConcert(), songsDto);
    }
}
