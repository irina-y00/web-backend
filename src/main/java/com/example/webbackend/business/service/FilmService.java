package com.example.webbackend.business.service;

import com.example.webbackend.business.entity.FilmEntity;
import com.example.webbackend.web.dto.film.FilmCreateDto;
import com.example.webbackend.web.dto.film.FilmReadDto;

import java.util.List;

//Описываем поведения сервиса для фильма
public interface FilmService extends DtoCrudService<Long, FilmReadDto, FilmCreateDto> {


}
