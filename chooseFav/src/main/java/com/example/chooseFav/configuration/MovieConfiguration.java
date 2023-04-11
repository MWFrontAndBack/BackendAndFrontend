//package com.example.chooseFav.configuration;
//
//import com.example.chooseFav.model.Film;
//import com.example.chooseFav.repository.FilmRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class MovieConfiguration {
//    @Bean
//    CommandLineRunner commandLineRunner(FilmRepository repository){
//        return args -> {
//         Film StarWars = new Film("Star wars","https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Star_Wars_Logo.svg/1200px-Star_Wars_Logo.svg.png", LocalDate.of(1977, Month.APRIL,9));
//         Film HarryPotter = new Film("Harry Potter","https://www.granice.pl/sys6/pliki/text/04/11/2022/642108551372eb2c99ef3b41995f4a16.jpg",LocalDate.of(1997, Month.FEBRUARY,11));
//         Film IndianaJones = new Film("Indiana Jones","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Indianajones4.jpg/640px-Indianajones4.jpg",LocalDate.of(1989, Month.MARCH,17));
//         Film WalkingDead = new Film("Walking Dead","https://m.media-amazon.com/images/M/MV5BZmU5NTcwNjktODIwMi00ZmZkLTk4ZWUtYzVjZWQ5ZTZjN2RlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",LocalDate.of(2010, Month.JULY,30));
//         Film FastAndFurious = new Film("Fast and Furious","https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",LocalDate.of(2001, Month.JULY,30));
//         Film SharkNado = new Film("SharkNado","https://i.wpimg.pl/O/431x600/i.wp.pl/a/f/film/008/98/05/0390598.jpg",LocalDate.of(2018, Month.JULY,30));
//         Film Labirynt = new Film("Labirynt","https://fwcdn.pl/fpo/71/69/507169/7568460.3.jpg",LocalDate.of(2013, Month.JULY,30));
//         Film NinjaTurtles = new Film("Ninja Turtles","https://www.comingsoon.net/wp-content/uploads/sites/3/2023/02/NICKELODEON_TEENAGEMUTANTNINJATURTLES_010_275304_1920x1080.jpeg?w=1024",LocalDate.of(2014, Month.SEPTEMBER,17));
//         Film PowerRangers = new Film("Power Rangers","https://fwcdn.pl/nph/49468/2020/28133_2.11.jpg",LocalDate.of(1993, Month.JUNE,28));
////
//        repository.saveAll(List.of(StarWars,HarryPotter,IndianaJones,WalkingDead,FastAndFurious,SharkNado,Labirynt,PowerRangers,NinjaTurtles));
//        };
//
//    }
//}
