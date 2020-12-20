package com.example.webbackend.web.dto.info_film;

import com.example.webbackend.web.dto.ParentDto;
import com.example.webbackend.web.dto.director.DirectorDto;
import com.example.webbackend.web.dto.genre.GenreDto;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class InfoFilmReadDto implements ParentDto {
    private Long id;
    private LocalDate date;
    private String budget;
    private List<GenreDto> genre;
    private List<DirectorDto> director;

}
