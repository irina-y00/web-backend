package com.example.webbackend.web.api.v1;

import com.example.webbackend.business.service.GenreService;
import com.example.webbackend.web.dto.genre.GenreDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.webbackend.utils.ApiConstant.GENRE;

@RestController
@RequestMapping(GENRE)
@RequiredArgsConstructor
public class GenreController {
    private final GenreService service;

    @PostMapping
    public Long save(@RequestBody GenreDto dto){
        return service.saveDto(dto);
    }

    @PutMapping
    public void update(@RequestBody GenreDto dto) { service.update(dto);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){service.delete(id);}

    @GetMapping
    public List<GenreDto> getAll(){
        return service.findAllDto();
    }
}
