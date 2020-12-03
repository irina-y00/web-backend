package com.example.webbackend.business.service;

import com.example.webbackend.business.entity.Film;

import java.util.List;

public interface FilmService {
    Film getFilm(Integer id);
    List<Film> getAllFilm();
}
