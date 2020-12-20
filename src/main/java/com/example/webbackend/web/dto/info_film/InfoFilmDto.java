package com.example.webbackend.web.dto.info_film;

import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class InfoFilmDto implements ParentDto {
    private LocalDate date;
    private String budget;
    private List<Long> genreIds;
    private List<Long> directorsId;
}
