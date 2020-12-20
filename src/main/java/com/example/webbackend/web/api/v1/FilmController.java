package com.example.webbackend.web.api.v1;

import com.example.webbackend.business.service.FilmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.webbackend.utils.ApiConstant.FILM;

@RequestMapping(FILM)
@RestController
public class FilmController {

    final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

}
