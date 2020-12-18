package com.example.webbackend.business.service;

import com.example.webbackend.business.entity.FilmEntity;

import java.util.List;

//Описываем поведения сервиса для фильма
public interface FilmService {
    FilmEntity getFilm(Integer id);
    List<FilmEntity> getAllFilm();
}
