package musicApp.service;

import musicApp.entity.Song;
import musicApp.repository.SOngRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SongService {

    private final SOngRepository songRepository;
    private final ArtistService artistService;

    public SongService(SOngRepository songRepository,   @Lazy ArtistService artistService) {
        this.songRepository = songRepository;
        this.artistService = artistService;
    }

    public List<Song> findAllById(Collection<Long> ids){
        return IterableUtils.toList(songRepository.findAllById(ids));
    }

    public Song save(Song song){
        return songRepository.save(song);
    }

    //Optional
    public Song findById(Long id){
        return songRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Don't find such song "+id));
    }

}
