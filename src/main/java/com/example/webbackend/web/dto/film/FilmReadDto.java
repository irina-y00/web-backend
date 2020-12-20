package com.example.webbackend.web.dto.film;

import com.example.webbackend.web.dto.info_film.InfoFilmReadDto;
import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

@Data
public class FilmReadDto implements ParentDto {
    private Long id;
    private String name;
    private String uriImage;
    private InfoFilmReadDto infoFilm;
}
