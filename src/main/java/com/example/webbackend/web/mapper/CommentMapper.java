package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.CommentEntity;
import com.example.webbackend.web.dto.comment.CommentCreateDto;
import com.example.webbackend.web.dto.comment.CommentDto;
import org.mapstruct.Mapper;

@Mapper
public interface CommentMapper extends GenericMapper<CommentCreateDto, CommentEntity>, GenericReadMapper<CommentDto, CommentEntity>{
}
