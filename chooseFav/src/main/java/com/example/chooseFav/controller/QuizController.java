package com.example.chooseFav.controller;

import com.example.chooseFav.model.Film;
import com.example.chooseFav.repository.FilmRepository;
import com.example.chooseFav.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
@CrossOrigin
public class QuizController {
    @Autowired
    private FilmService filmService;





    @GetMapping("/all")
    @ResponseBody
    public List<Film> showMovies(){

        List<Film> allFilms = filmService.getAllFilms();
//        List<Film> twoRandomElents = filmService.getTwoRandomElents(allFilms);

        return allFilms;
    }
    @GetMapping("/{name}")
    @ResponseBody
    public Film findbyName(@PathVariable("name") String name) {
        Optional<Film> movieByName = filmService.findMovieByName(name);
        System.out.println(movieByName);
        // additional logic to filter by category
        return movieByName.orElseThrow();
    }

    @GetMapping("/allmap")
    public HashMap<Film, Film> getmap(){
        HashMap<Film, Film> filmFilmHashMap = filmService.turnFilmIntoHashMap();
        return filmFilmHashMap;
    }
}
