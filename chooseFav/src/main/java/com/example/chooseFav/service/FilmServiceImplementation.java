package com.example.chooseFav.service;

import com.example.chooseFav.model.Film;
import com.example.chooseFav.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FilmServiceImplementation implements FilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public List<Film> getAllFilms() {
        List<Film> all = filmRepository.findAll();
        return all;
    }

    @Override
    public HashMap<Film, Film> turnFilmIntoHashMap() {
        List<Film> all2 = filmRepository.findAll();

        HashMap<Film, Film> outputMap = new HashMap<>();
        for (int i = 0; i < all2.size(); i++) {


            List<Film> twoRandomElents = getTwoRandomElents(all2);
            outputMap.put(twoRandomElents.get(0), twoRandomElents.get(1));

        }
        return outputMap;
    }



    public List<Film> getTwoRandomElents(List<Film> films) {
        List<Film> elements = new ArrayList<>();
        Random rand = new Random();

        int numberOfElements = 2;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(films.size());

            Film randomElement = films.get(randomIndex);
            elements.add(randomElement);
            films.remove(randomIndex);
        }
        return elements;
    }

    @Override
    public Optional<Film> findMovieByName(String name) {
         Optional<Film> fimByName = filmRepository.findFimByName(name);
         if(fimByName.isEmpty()){
             throw new IllegalStateException("movie not exist ");
         }
         return fimByName;
    }


}
