package musicApp.service;

import lombok.RequiredArgsConstructor;
import musicApp.entity.Artist;
import musicApp.entity.Song;
import musicApp.repository.ArtistRepository;
import musicApp.repository.SOngRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;

    public Page<Artist> findAll(Pageable pageable){
        return artistRepository.findAll(pageable);
    }

    public Artist save(Artist artist){
        return artistRepository.save(artist);
    }

    private final SOngRepository sOngRepository;

    public Artist findById(Long id){
        return artistRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Don't find such user "+id));
    }

    public Artist updateDate(Long id, String date){
        Artist artist = findById(id);
        artist.setDateOfConcert(date);

        return artistRepository.save(artist);
    }

    public List<Artist> switchArtists(Long idFirst, Long idSecond){
        Artist tempArtistOne = findById(idFirst);
        Artist tempArtistTwo = findById(idSecond);
        String tempName = tempArtistOne.getName();

        tempArtistOne.setName(tempArtistTwo.getName());
        tempArtistTwo.setName(tempName);

        List<Artist> updatedArtists = new ArrayList<>();
        updatedArtists.add(artistRepository.save(tempArtistOne));
        updatedArtists.add(artistRepository.save(tempArtistTwo));

        return updatedArtists;
    }
}
