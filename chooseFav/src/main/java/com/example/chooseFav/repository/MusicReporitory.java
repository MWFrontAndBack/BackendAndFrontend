package com.example.chooseFav.repository;

import com.example.chooseFav.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicReporitory extends JpaRepository<Music,Long> {
}
