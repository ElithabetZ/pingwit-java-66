package comPlayCar.api;
import comPlayCar.dto.CarPlayDto;
import comPlayCar.entity.CarPlay;
import comPlayCar.service.CarPlaySvice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carplay")
public class CarPlayController {

    private final CarPlaySvice carPlaySvice;
    private final CarPlayConverter carPlayConverter;

    public CarPlayController(CarPlaySvice carPlaySvice, CarPlayConverter carPlayConverter) {
        this.carPlaySvice = carPlaySvice;
        this.carPlayConverter = carPlayConverter;
    }

    @GetMapping ("/version")
    public List<CarPlayDto> getByVersion(@RequestParam Long version){
        List<CarPlay> carPlayList = carPlaySvice.getAllByVersion(version);
        return carPlayList.stream()
                .map(carPlayConverter::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping ("/date")
    public List<CarPlayDto> getByVersion(){
        List<CarPlay> carPlayList = carPlaySvice.getAllByDateTime();
        return carPlayList.stream()
                .map(carPlayConverter::toDto)
                .collect(Collectors.toList());
    }
    //по id чаще всего делается не параметр, а @PathVariable
    @GetMapping ("/id")
    @ResponseBody
    public List<CarPlayDto> getByIdRange(@RequestParam List<Long> list){
        List<CarPlay> carPlayList = carPlaySvice.getAllByIdRange(list);
        return carPlayList.stream()
                .map(carPlayConverter::toDto)
                .collect(Collectors.toList());
    }
}
