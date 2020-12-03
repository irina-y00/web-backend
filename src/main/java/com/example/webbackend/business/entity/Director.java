package com.example.webbackend.business.entity;

public class Director {
    private Integer id;
    private String fullName;

    public Director(Integer id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Director() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
