package musicApp.api.controllers;

import musicApp.api.converters.SongConverter;
import musicApp.dto.SongDto;
import musicApp.entity.Song;
import musicApp.service.SongService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/songs")
public class SongController {

    public final SongConverter songConverter;
    public final SongService songService;

    public SongController(SongConverter songConverter, SongService songService) {
        this.songConverter = songConverter;
        this.songService = songService;
    }

    @PostMapping
    public SongDto save(@RequestBody SongDto dto){
        Song model = songConverter.toModel(dto);
        Song saved = songService.save(model);
        return songConverter.toDto(saved);
    }
}
