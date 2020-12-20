package com.example.webbackend.web.dto.comment;

import com.example.webbackend.web.dto.ParentDto;
import lombok.Data;

@Data
public class CommentCreateDto implements ParentDto {
    private Long id;
    private String comment;
    private Long filmId;
}

