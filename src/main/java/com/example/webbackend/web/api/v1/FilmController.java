package com.example.webbackend.web.api.v1;

import com.example.webbackend.business.service.FilmService;
import com.example.webbackend.web.dto.film.FilmCreateDto;
import com.example.webbackend.web.dto.film.FilmReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.webbackend.utils.ApiConstant.FILM;

@RequestMapping(FILM)
@RestController
@RequiredArgsConstructor
public class FilmController {

    private final FilmService service;

    @GetMapping
    public List<FilmReadDto> getAll(){
        return service.findAllDto();
    }

    @GetMapping("/{id}")
    public FilmReadDto get(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Long save(@RequestBody FilmCreateDto dto){
        return service.saveDto(dto);
    }

    @PutMapping
    public void update(@RequestBody FilmCreateDto dto) { service.update(dto);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){service.delete(id);}

}
