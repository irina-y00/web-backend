package com.example.webbackend.web.dto.film;

import com.example.webbackend.web.dto.info_film.InfoFilmDto;
import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

@Data
public class FilmCreateDto implements ParentDto {
    private Long id;
    private String name;
    private InfoFilmDto filmInfo;
}
