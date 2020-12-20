package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.service.CommentService;
import com.example.webbackend.web.dto.comment.CommentCreateDto;
import com.example.webbackend.web.dto.comment.CommentDto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Override
    public List<CommentDto> findAllDto() {
        return null;
    }

    @Override
    public Long saveDto(@NotNull CommentCreateDto dto) {
        return null;
    }

    @Override
    public void update(@NotNull CommentCreateDto dto) {

    }

    @Override
    public void delete(@NotNull Long id) {

    }
}
