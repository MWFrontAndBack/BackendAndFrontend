package com.example.chooseFav.repository;

import com.example.chooseFav.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmRepository extends JpaRepository<Film,Long> {
    @Query("SELECT m FROM Film m WHERE m.Name = ?1")
    Optional<Film> findFimByName(String name);

}
