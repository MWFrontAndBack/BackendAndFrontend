package com.example.chooseFav;

import com.example.chooseFav.model.Film;
import com.example.chooseFav.repository.FilmRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ChooseFavApplicationTests {
	@Autowired
public FilmRepository filmRepository;
	@Test
	void contextLoads() {
		Optional<Film> starWars = filmRepository.findFimByName("Star Wars");
		System.out.println(starWars);
	}

}
