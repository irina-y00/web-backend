package com.example.webbackend.business.entity;

import java.time.LocalDate;
import java.util.List;

public class InfoFilm {
    private LocalDate dateFilm;
    private List<Genre> genresList;
    private List<Director> directors;
    private String budget;

    public InfoFilm(LocalDate dateFilm, List<Genre> genresList, List<Director> directors, String budget) {
        this.dateFilm = dateFilm;
        this.genresList = genresList;
        this.directors = directors;
        this.budget = budget;
    }

    public InfoFilm(){

    }

    public LocalDate getDateFilm() {
        return dateFilm;
    }

    public void setDateFilm(LocalDate dateFilm) {
        this.dateFilm = dateFilm;
    }

    public List<Genre> getGenresList() {
        return genresList;
    }

    public void setGenresList(List<Genre> genresList) {
        this.genresList = genresList;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
