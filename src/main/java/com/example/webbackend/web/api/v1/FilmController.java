package com.example.webbackend.web.api.v1;

import com.example.webbackend.business.entity.FilmEntity;
import com.example.webbackend.business.service.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.webbackend.utils.ApiConstant.FILM;

@RequestMapping(FILM)
@RestController
public class FilmController {

    final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<FilmEntity> getAll(){
        return filmService.getAllFilm();
    }

    @GetMapping("/{id}") // url: localhost:8080/film/{id}
    public FilmEntity getFilmById(@PathVariable Integer id){
        return filmService.getFilm(id);
    }
}
