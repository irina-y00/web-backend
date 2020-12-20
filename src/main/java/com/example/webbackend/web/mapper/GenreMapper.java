package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.GenreEntity;
import com.example.webbackend.web.dto.genre.GenreDto;
import org.mapstruct.Mapper;

@Mapper
public interface GenreMapper extends GenericMapper<GenreDto,GenreEntity> {
}
