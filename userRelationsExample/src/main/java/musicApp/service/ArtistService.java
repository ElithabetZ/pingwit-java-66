package musicApp.service;

import lombok.AllArgsConstructor;
import musicApp.entity.Artist;
import musicApp.repository.ArtistRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;
    @Lazy
    private final SongService songService;

    public Page<Artist> findAll(Pageable pageable){
        return artistRepository.findAll(pageable);
    }

    public Artist save(Artist artist){
        return artistRepository.save(artist);
    }



    public Artist findById(Long id){
        return artistRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Don't find such user "+id));//User with id=[%d] does not exist. Лучше вернуть Optional.
    }

    //почему не попробовать использовать новый материал с @Query/TypedQuery?
    public Artist updateDate(Long id, String date){
        Artist artist = findById(id);
        artist.setDateOfConcert(date);

        return artistRepository.save(artist);
    }

    //switchArtists - > switchArtistsNames! у тебя не полноценный switch. Имя метода должна соответствовать тому, что в нем происходит
    public List<Artist> switchArtistsNames(Long idFirst, Long idSecond){
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
