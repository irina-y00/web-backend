package com.example.webbackend.business.service;

import com.example.webbackend.business.entity.Film;

import java.util.List;

//Описываем поведения сервиса для фильма
public interface FilmService {
    Film getFilm(Integer id);
    List<Film> getAllFilm();
}
