package musicApp.api.controllers;

import musicApp.api.converters.ArtistRequestConverter;
import musicApp.api.converters.ArtistResponseConverter;
import musicApp.dto.ArtistRequestDto;
import musicApp.dto.ArtistResponseDto;
import musicApp.entity.Artist;
import musicApp.service.ArtistService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService artistService;
    private final ArtistResponseConverter artistResponseConverter;
    private final ArtistRequestConverter artistRequestConverter;

    public ArtistController(ArtistService artistService, ArtistResponseConverter artistResponseConverter, ArtistRequestConverter artistRequestConverter) {

        this.artistService = artistService;
        this.artistResponseConverter = artistResponseConverter;
        this.artistRequestConverter = artistRequestConverter;
    }

    @GetMapping
    public Page<ArtistResponseDto> findAll(@RequestParam(required = false, defaultValue = "0") int page,
                                @RequestParam(required = false, defaultValue = "10") int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Artist> artists = artistService.findAll(pageRequest);
        List<ArtistResponseDto> artistResponse = artists.stream()
                .map(artistResponseConverter::toDto).toList();

        return new PageImpl<>(artistResponse, pageRequest, artists.getTotalElements());
    }

    @PostMapping
    public ArtistResponseDto save(@RequestBody ArtistRequestDto dto){

        Artist model = artistRequestConverter.toModel(dto);
        Artist saved = artistService.save(model);
        return artistResponseConverter.toDto(saved);
    }

    @PutMapping("/date")
    //id сущности - часть url, но никак и никогда не параметр, это не по REST принципам ->  @PutMapping("/{id}/date")
    public ArtistResponseDto updateDateOfConsert(@RequestParam long id, @RequestParam String date){
        Artist updatedArtist = artistService.updateDate(id, date);
        return artistResponseConverter.toDto(updatedArtist);
    }
/*
 @PutMapping("/{id}"), id - тот, кого ты хочешь изменить
 @RequestParam String newName / ну или как у тебя id

 changeArtists - и так понятно, что это change, так как у тебя метод PUT

 Метод PUT - полное обновление. У тебя по заданию частичное (только имя существующего артиста). Значит вместо PutMapping->PatchMapping
*/
    @PutMapping("/changeArtists")
    public List<ArtistResponseDto> changeArtist(@RequestParam long idFirst, @RequestParam long idSecond){
        List<Artist> switchedArtists = artistService.switchArtists(idFirst, idSecond);
        return switchedArtists.stream().map(artistResponseConverter::toDto).toList();
    }
}
