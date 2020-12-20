package com.example.webbackend.web.dto.genre;

import com.example.webbackend.web.dto.ParentDto;
import liquibase.change.core.LoadDataChange;
import lombok.Data;

@Data
public class GenreDto implements ParentDto {
    private Long id;
    private String name;
}
