package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.GenreEntity;
import com.example.webbackend.web.dto.genre.GenreDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface GenreMapper extends GenericMapper<GenreDto,GenreEntity> {

    @Mapping(target = "id", source = "genreId")
    GenreEntity fromId(Long genreId);

    List<GenreEntity> toNewsEntity(List<Long> ids);
}
