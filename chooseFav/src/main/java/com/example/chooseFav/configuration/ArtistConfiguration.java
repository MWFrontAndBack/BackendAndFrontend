package com.example.chooseFav.configuration;

import com.example.chooseFav.model.Artist;
import com.example.chooseFav.model.Film;
import com.example.chooseFav.model.Music;
import com.example.chooseFav.repository.ArtistRepository;
import com.example.chooseFav.repository.FilmRepository;
import com.example.chooseFav.repository.MusicReporitory;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;


import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ArtistConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(ArtistRepository repository, MusicReporitory mRepository, FilmRepository frepository) {
        return args -> {

            // Create an Artist object for Lil Pump
            Artist lilPump = new Artist();
            lilPump.setArtistname("Lil Pump");
            lilPump.setPhoto("https://i.ytimg.com/vi/4LfJnj66HVQ/maxresdefault.jpg");

// Create a list of Music objects for Lil Pump
            List<Music> lilPumpMusicList = new ArrayList<>();

// Create a new Music object and add it to the list for Lil Pump
            Music lilPumpMusic1 = new Music();
            lilPumpMusic1.setName("DRose");
            lilPumpMusic1.setUrl("https://images.genius.com/a476737535b51ed9e1166e645b73858a.1000x1000x1.jpg");
            lilPumpMusic1.setPath("../assets/sounds/drose.mp3");
            lilPumpMusic1.setArtist(lilPump);
            lilPumpMusicList.add(lilPumpMusic1);

// Create another Music object and add it to the list for Lil Pump
            Music lilPumpMusic2 = new Music();
            lilPumpMusic2.setName("Gucci Gang");
            lilPumpMusic2.setUrl("https://images-na.ssl-images-amazon.com/images/I/71jEoeaZG9L._SL1500_.jpg");
            lilPumpMusic2.setPath("../assets/sounds/guccigang.mp3");
            lilPumpMusic2.setArtist(lilPump);
            lilPumpMusicList.add(lilPumpMusic2);

// Set the music collection of Lil Pump
            lilPump.setMusicCollection(lilPumpMusicList);

// Save the Lil Pump artist and music objects to the repository
            repository.save(lilPump);

// Repeat the same process for other artists and their music
// ...

// Create an Artist object for Young Igi
            Artist youngIgi = new Artist();
            youngIgi.setArtistname("Young Igi");
            youngIgi.setPhoto("https://i.wpimg.pl/O/1250x656/d.wpimg.pl/1501073493--64641117/igi.jpg");

// Create a list of Music objects for Young Igi
            List<Music> youngIgiMusicList = new ArrayList<>();

// Create a new Music object and add it to the list for Young Igi
            Music youngIgiMusic1 = new Music();
            youngIgiMusic1.setName("Mówiłas");
            youngIgiMusic1.setUrl("https://i.ytimg.com/vi/U5h-0zB39tM/hqdefault.jpg");
            youngIgiMusic1.setPath("../assets/sounds/mowilas.mp3");
            youngIgiMusic1.setArtist(youngIgi);
            youngIgiMusicList.add(youngIgiMusic1);

// Create another Music object and add it to the list for Young Igi
            Music youngIgiMusic2 = new Music();
            youngIgiMusic2.setName("Rolex");
            youngIgiMusic2.setUrl("https://i.ytimg.com/vi/r3D0tya-1yk/hqdefault.jpg");
            youngIgiMusic2.setPath("../assets/sounds/rolex.mp3");
            youngIgiMusic2.setArtist(youngIgi);
            youngIgiMusicList.add(youngIgiMusic2);

// Set the music collection of Young Igi
            youngIgi.setMusicCollection(youngIgiMusicList);

// Save the Young Igi artist and music objects to the repository
            repository.save(youngIgi);
            // Create a new artist object for Eminem
            Artist eminem = new Artist();
            eminem.setArtistname("Eminem");
            eminem.setPhoto("https://glamrap.pl/wp-content/uploads/2022/05/eminem-1000x600.jpg");

// Create a list of Music objects for Eminem
            List<Music> eminemMusicList = new ArrayList<>();

// Create a new Music object and add it to the list for Eminem
            Music eminemMusic1 = new Music();
            eminemMusic1.setName("Lose Yourself");
            eminemMusic1.setUrl("https://upload.wikimedia.org/wikipedia/en/9/93/Eminem_-_Lose_Yourself_%28single_cover%29.jpg");
            eminemMusic1.setPath("../assets/sounds/loseyourself.mp3");
            eminemMusic1.setArtist(eminem);
            eminemMusicList.add(eminemMusic1);

// Create another Music object and add it to the list for Eminem
            Music eminemMusic2 = new Music();
            eminemMusic2.setName("Love the Way You Lie");
            eminemMusic2.setUrl("https://upload.wikimedia.org/wikipedia/en/thumb/4/4e/Love_the_Way_You_Lie_cover.jpg/220px-Love_the_Way_You_Lie_cover.jpg");
            eminemMusic2.setPath("../assets/sounds/lovetheyoulielyrics.mp3");
            eminemMusic2.setArtist(eminem);
            eminemMusicList.add(eminemMusic2);

// Set the music collection of the artist for Eminem
            eminem.setMusicCollection(eminemMusicList);

// Save the artist and music objects to the repository for Eminem
            repository.save(eminem);

// Create a new artist object for Tech N9ne
            Artist techN9ne = new Artist();
            techN9ne.setArtistname("Tech N9ne");
            techN9ne.setPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Tech_N9ne_on_2006-11-06.jpg/240px-Tech_N9ne_on_2006-11-06.jpg");

// Create a list of Music objects for Tech N9ne
            List<Music> techN9neMusicList = new ArrayList<>();

// Create a new Music object and add it to the list for Tech N9ne
            Music techN9neMusic1 = new Music();
            techN9neMusic1.setName("Hood Go Crazy");
            techN9neMusic1.setUrl("https://upload.wikimedia.org/wikipedia/en/3/3e/Hood_Go_Crazy.jpg");
            techN9neMusic1.setPath("../assets/sounds/hoodgocrazy.mp3");
            techN9neMusic1.setArtist(techN9ne);
            techN9neMusicList.add(techN9neMusic1);

// Create another Music object and add it to the list for Tech N9ne
            Music techN9neMusic2 = new Music();
            techN9neMusic2.setName("Fragile");
            techN9neMusic2.setUrl("https://upload.wikimedia.org/wikipedia/en/7/78/Tech_N9ne_Fragile.jpg");
            techN9neMusic2.setPath("../assets/sounds/fragile.mp3");
            techN9neMusic2.setArtist(techN9ne);
            techN9neMusicList.add(techN9neMusic2);
techN9ne.setMusicCollection(techN9neMusicList);
            repository.save(techN9ne);

            // Create a new artist object
            Artist artist = new Artist();
            artist.setArtistname("Adele");
            artist.setPhoto("https://i.wpimg.pl/1200x/filerepo.grupawp.pl/api/v1/display/embed/7c5d79bb-9209-4e76-a3f6-a6206f3b05fa");

// Create a list of Music objects
            List<Music> musicList = new ArrayList<>();

// Create a new Music object and add it to the list
            Music music1 = new Music();
            music1.setName("Someone Like You");
            music1.setUrl("https://upload.wikimedia.org/wikipedia/en/3/3f/Someone_Like_You_single_cover.jpg");
            music1.setPath("../assets/sounds/someonelikeyou.mp3");
            music1.setArtist(artist);
            musicList.add(music1);

// Create another Music object and add it to the list
            Music music2 = new Music();
            music2.setName("Rolling in the Deep");
            music2.setUrl("https://upload.wikimedia.org/wikipedia/en/1/1f/Rolling_in_the_Deep.jpeg");
            music2.setPath("../assets/sounds/rollinginthedeep.mp3");
            music2.setArtist(artist);
            musicList.add(music2);

// Set the music collection of the artist
            artist.setMusicCollection(musicList);

// Save the artist and music objects to the repository
            repository.save(artist);


// Set the music collection


//            repository.saveAll(List.of(LilPump,YoungIgi,MafiaGang,TechN9ne,Eminem,SnoopDog));

            // filmy
            Film StarWars = new Film("Star wars", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Star_Wars_Logo.svg/1200px-Star_Wars_Logo.svg.png", LocalDate.of(1977, Month.APRIL, 9));
            Film HarryPotter = new Film("Harry Potter", "https://www.granice.pl/sys6/pliki/text/04/11/2022/642108551372eb2c99ef3b41995f4a16.jpg", LocalDate.of(1997, Month.FEBRUARY, 11));
            Film IndianaJones = new Film("Indiana Jones", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Indianajones4.jpg/640px-Indianajones4.jpg", LocalDate.of(1989, Month.MARCH, 17));
            Film WalkingDead = new Film("Walking Dead", "https://m.media-amazon.com/images/M/MV5BZmU5NTcwNjktODIwMi00ZmZkLTk4ZWUtYzVjZWQ5ZTZjN2RlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg", LocalDate.of(2010, Month.JULY, 30));
            Film FastAndFurious = new Film("Fast and Furious", "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg", LocalDate.of(2001, Month.JULY, 30));
            Film SharkNado = new Film("SharkNado", "https://i.wpimg.pl/O/431x600/i.wp.pl/a/f/film/008/98/05/0390598.jpg", LocalDate.of(2018, Month.JULY, 30));
            Film Labirynt = new Film("Labirynt", "https://fwcdn.pl/fpo/71/69/507169/7568460.3.jpg", LocalDate.of(2013, Month.JULY, 30));
            Film NinjaTurtles = new Film("Ninja Turtles", "https://www.comingsoon.net/wp-content/uploads/sites/3/2023/02/NICKELODEON_TEENAGEMUTANTNINJATURTLES_010_275304_1920x1080.jpeg?w=1024", LocalDate.of(2014, Month.SEPTEMBER, 17));
            Film PowerRangers = new Film("Power Rangers", "https://fwcdn.pl/nph/49468/2020/28133_2.11.jpg", LocalDate.of(1993, Month.JUNE, 28));

            frepository.saveAll(List.of(StarWars, HarryPotter, IndianaJones, WalkingDead, FastAndFurious, SharkNado, Labirynt, PowerRangers, NinjaTurtles));
        };
    }
}
