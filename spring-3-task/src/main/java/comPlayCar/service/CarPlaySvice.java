package comPlayCar.service;//com.playcar.service

import comPlayCar.entity.CarPlay;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import comPlayCar.repository.CarPlayRepository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
//CarPlayService
public class CarPlaySvice {

    private final CarPlayRepository carPlayRepository;

    public CarPlaySvice(CarPlayRepository carPlayRepository){
        this.carPlayRepository = carPlayRepository;
    }

    public List<CarPlay> getAllByVersion(Long version){
        return IterableUtils.toList(carPlayRepository.findAllByVersionGreaterThan(version));
    }

    //getCurrentlyUpdated
    //твое название не соответствует тому, что делает
    public List<CarPlay> getAllByDateTime(){
        return IterableUtils.toList(carPlayRepository.findAllByupdatedate(LocalDateTime.now().toLocalDate()));
    }

    public List<CarPlay> getAllByIdRange(List<Long> list){
        return IterableUtils.toList(carPlayRepository.findAllByIdIn(list));
    }
}
