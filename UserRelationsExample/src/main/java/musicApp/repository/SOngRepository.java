package musicApp.repository;

import musicApp.entity.Song;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SOngRepository extends PagingAndSortingRepository<Song, Long> {
}
