package comPlayCar.api;

import comPlayCar.dto.CarPlayDto;
import comPlayCar.entity.CarPlay;
import org.springframework.stereotype.Component;

@Component
public class CarPlayConverter {

    public CarPlay toModel(CarPlayDto carPlayDto){
        CarPlay carPlay = new CarPlay();
        carPlay.setVersion(carPlayDto.version());
        carPlay.setUpdatable(carPlayDto.updatable());
        carPlay.setUpdatedate(carPlayDto.updatedate());
        carPlay.setConnection(carPlayDto.connection());
        return carPlay;
    }

    public CarPlayDto toDto(CarPlay carPlay){
        return new CarPlayDto(carPlay.getId(), carPlay.getVersion(), carPlay.getUpdatable(), carPlay.getConnection(), carPlay.getUpdatedate());
    }
}
