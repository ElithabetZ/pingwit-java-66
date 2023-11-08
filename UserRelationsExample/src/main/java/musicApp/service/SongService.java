package musicApp.service;

import lombok.RequiredArgsConstructor;
import musicApp.entity.Artist;
import musicApp.entity.Song;
import musicApp.repository.ArtistRepository;
import musicApp.repository.SOngRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SongService {

    private final SOngRepository songRepository;
    private final ArtistService artistService;

    public List<Song> findAllById(Collection<Long> ids){
        return IterableUtils.toList(songRepository.findAllById(ids));
    }

    public Song save(Song song){
        return songRepository.save(song);
    }

    public Song findById(Long id){
        return songRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Don't find such song "+id));
    }

}
