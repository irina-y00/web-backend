package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.CommentEntity;
import com.example.webbackend.business.entity.FilmEntity;
import com.example.webbackend.web.dto.comment.CommentCreateDto;
import com.example.webbackend.web.dto.comment.CommentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CommentMapper extends GenericMapper<CommentCreateDto, CommentEntity>, GenericReadMapper<CommentDto, CommentEntity>{

    @Override
    @Mapping(target = "film", source = "dto")
    CommentEntity toEntity(CommentCreateDto dto);

    default FilmEntity toFilm(CommentCreateDto dto){
        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setId(dto.getId());
        return filmEntity;
    }
}
