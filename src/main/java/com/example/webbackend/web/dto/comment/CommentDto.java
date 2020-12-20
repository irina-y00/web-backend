package com.example.webbackend.web.dto.comment;

import com.example.webbackend.web.dto.ParentDto;
import com.example.webbackend.web.dto.user.UserDto;
import lombok.Data;

@Data
public class CommentDto implements ParentDto {
    private Long id;
    private String comment;
    private UserDto dto;
}

