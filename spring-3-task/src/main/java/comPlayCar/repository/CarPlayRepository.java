package comPlayCar.repository;

import comPlayCar.entity.CarPlay;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface CarPlayRepository extends CrudRepository<CarPlay, Long> {

    List<CarPlay> findAllByVersionGreaterThan(Long version);

    List<CarPlay> findAllByupdatedate(LocalDate time);

    List<CarPlay> findAllByIdIn(List<Long> list);
}
