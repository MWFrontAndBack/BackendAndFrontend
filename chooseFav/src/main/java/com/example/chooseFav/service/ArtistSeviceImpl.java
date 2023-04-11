package com.example.chooseFav.service;

import com.example.chooseFav.model.Artist;
import com.example.chooseFav.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

@Service
public class ArtistSeviceImpl implements ArtistService{
    @Autowired
    private ArtistRepository artistRepository;


    @Override
    public Stack<Artist> convertToStack() {
        List<Artist> all = artistRepository.findAll();
        Stack<Artist> artistStack  = new Stack<>();
        artistStack.addAll(all);
        return artistStack;
    }
}
