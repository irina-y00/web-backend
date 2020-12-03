package com.example.webbackend.business.entity;


public class Film {
    private Integer id;
    private String name;
    private String uriImage;
    private String description;
    private InfoFilm infoFilm;

    public Film(Integer id, String name, String uriImage, String description, InfoFilm infoFilm) {
        this.id = id;
        this.name = name;
        this.uriImage = uriImage;
        this.description = description;
        this.infoFilm = infoFilm;
    }

    public Film(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUriImage() {
        return uriImage;
    }

    public void setUriImage(String uriImage) {
        this.uriImage = uriImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InfoFilm getInfoFilm() {
        return infoFilm;
    }

    public void setInfoFilm(InfoFilm infoFilm) {
        this.infoFilm = infoFilm;
    }
}
