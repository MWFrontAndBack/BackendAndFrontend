package com.example.chooseFav.service;

import com.example.chooseFav.model.Film;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface FilmService {
    public List<Film> getAllFilms();

    public HashMap<Film,Film> turnFilmIntoHashMap();

   public List<Film> getTwoRandomElents(List<Film> films);

   public Optional<Film> findMovieByName(String name);

}
