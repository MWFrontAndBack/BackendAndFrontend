package com.example.chooseFav.model;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long IdFilm;
    private String Name;

    private String  UrlFilm;

    private LocalDate realeaseYear;

    public Film() {
    }

    public Film(String name, String urlFilm) {
        Name = name;
        UrlFilm = urlFilm;
    }

    public Film(String name, String urlFilm, LocalDate realeaseYear) {
        Name = name;
        UrlFilm = urlFilm;
        this.realeaseYear = realeaseYear;
    }

    public Long getIdFilm() {
        return IdFilm;
    }

    public LocalDate getRealeaseYear() {
        return realeaseYear;
    }

    public void setRealeaseYear(LocalDate realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

    public void setIdFilm(Long idFilm) {
        IdFilm = idFilm;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrlFilm() {
        return UrlFilm;
    }

    public void setUrlFilm(String urlFilm) {
        UrlFilm = urlFilm;
    }

    public Film(Long idFilm, String name, String urlFilm) {
        IdFilm = idFilm;
        Name = name;
        UrlFilm = urlFilm;
    }

    @Override
    public String toString() {
        return "Film{" +
                "IdFilm=" + IdFilm +
                ", Name='" + Name + '\'' +
                ", UrlFilm='" + UrlFilm + '\'' +
                '}';
    }
}
