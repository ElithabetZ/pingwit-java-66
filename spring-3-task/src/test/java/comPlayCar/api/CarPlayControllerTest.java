package comPlayCar.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import comPlayCar.dto.CarPlayDto;
import comPlayCar.entity.CarPlay;
import comPlayCar.service.CarPlaySvice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.mockito.Mockito.when;
//1. форматирование кода; 2.com.carplay; 3.Где тесты сервиса, конвертера? Этого недостаточно
@ExtendWith(SpringExtension.class)
public class CarPlayControllerTest {

    @InjectMocks
    private CarPlayController carPlayController;
    @Mock
    private CarPlaySvice carPlaySvice;
    @Mock
    private CarPlayConverter carPlayConverter;

    @Test
    void getByVersion(){
        //given
         Long version = 1L;
         Long id = 11L;
         Boolean updatable = true;
         String connection = "Connection";
         LocalDate updatedate = LocalDate.of(2023, Month.DECEMBER,12);

         CarPlay carPlay = new CarPlay(id,version,updatable,connection,updatedate);
         List<CarPlay> carPlayList = List.of(carPlay);
         CarPlayDto carPlayDto = new CarPlayDto(id,version,updatable,connection,updatedate);
         List<CarPlayDto> expected = List.of(carPlayDto);

         when(carPlaySvice.getAllByVersion(version)).thenReturn(carPlayList);
         when(carPlayConverter.toDto(carPlay)).thenReturn(carPlayDto);

         //when
        List<CarPlayDto> actual = carPlayController.getByVersion(version);

        //then
        assertEquals(expected,actual);
    }
}
