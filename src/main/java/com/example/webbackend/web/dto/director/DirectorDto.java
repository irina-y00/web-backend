package com.example.webbackend.web.dto.director;

import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

@Data
public class DirectorDto implements ParentDto {
    private Long id;
    private String name;
}
