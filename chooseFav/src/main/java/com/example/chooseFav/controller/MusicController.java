package com.example.chooseFav.controller;


import com.example.chooseFav.model.Artist;
import com.example.chooseFav.model.dane.ArtistList;
import com.example.chooseFav.repository.ArtistRepository;
import com.example.chooseFav.service.ArtistService;
import com.example.chooseFav.service.ArtistSeviceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

@RestController
@RequestMapping("/music")
@CrossOrigin
public class MusicController {

    @Autowired
    private ArtistList artistList;



    @GetMapping("/all")
    @ResponseBody
    public List<Artist> showMovies(){

        List<Artist> artists = artistList.getArts().stream().toList();
//        System.out.println(artists);

        return artists;
    }

    @PostMapping("/two")
    @ResponseBody
    public List<Artist> getTwoArtist() throws Exception {
        System.out.println("wiadomość");
        List<Artist> twoArtist  = new ArrayList<>();
        if(artistList.getArts().size()>=2) {
            Artist a1 = artistList.getArts().pop();
            Artist a2 = artistList.getArts().pop();
            twoArtist.add(a1);
            twoArtist.add(a2);
        }else{
           return null;
        }

        return   twoArtist;

    }
}
