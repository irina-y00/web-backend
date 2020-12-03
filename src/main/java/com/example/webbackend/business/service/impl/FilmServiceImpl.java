package com.example.webbackend.business.service.impl;

import com.example.webbackend.business.entity.Director;
import com.example.webbackend.business.entity.Film;
import com.example.webbackend.business.entity.InfoFilm;
import com.example.webbackend.business.service.FilmService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final List<Film> films = initFilms();

    List<Film> initFilms(){
        Film film = new Film();
        Film film2 = new Film();
        Film film3 = new Film();

        InfoFilm infoFilm = new InfoFilm();
        InfoFilm infoFilm2 = new InfoFilm();
        InfoFilm infoFilm3 = new InfoFilm();

        Director director = new Director();
        Director director2 = new Director();
        Director director3 = new Director();

        director.setId(1);
        director.setFullName("Тодд Филлипс");

        director2.setId(2);
        director2.setFullName("Кристофер Нолан");

        director3.setId(3);
        director3.setFullName("Гай Ритчи");

        infoFilm.setDateFilm(LocalDate.of(2019,11,11));
        infoFilm.setBudget("122$ млн");
        infoFilm.setDirectors(List.of(director));

        infoFilm2.setDateFilm(LocalDate.of(2019,10,11));
        infoFilm2.setBudget("100$ млн");
        infoFilm2.setDirectors(List.of(director2));

        infoFilm3.setDateFilm(LocalDate.of(2019,10,11));
        infoFilm3.setBudget("100$ млн");
        infoFilm3.setDirectors(List.of(director3));

        film.setId(1);
        film.setName("Джокер");
        film.setUriImage("https://thumbs.dfs.ivi.ru/storage15/contents/7/d/726a60465521a979da1e41c3a01815.jpg");
        film.setInfoFilm(infoFilm);

        film2.setId(2);
        film2.setName("Довод");
        film2.setUriImage("https://thumbs.dfs.ivi.ru/storage15/contents/7/d/726a60465521a979da1e41c3a01815.jpg");
        film2.setInfoFilm(infoFilm2);

        film3.setId(3);
        film3.setName("Джентельмены");
        film3.setUriImage("https://thumbs.dfs.ivi.ru/storage15/contents/7/d/726a60465521a979da1e41c3a01815.jpg");
        film3.setInfoFilm(infoFilm3);

        return List.of(film,film2,film3);
    }

    @Override
    public Film getFilm(Integer id) {
        return films.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

    @Override
    public List<Film> getAllFilm() {
        return films;
    }
}
