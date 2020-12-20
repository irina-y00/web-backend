package com.example.webbackend.web.mapper;

import com.example.webbackend.business.entity.FilmEntity;
import com.example.webbackend.web.dto.film.FilmCreateDto;
import com.example.webbackend.web.dto.film.FilmReadDto;
import org.mapstruct.Mapper;

@Mapper
public interface FilmMapper extends GenericReadMapper<FilmReadDto, FilmEntity>, GenericMapper<FilmCreateDto, FilmEntity> {
}
