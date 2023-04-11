package com.example.chooseFav.service;

import com.example.chooseFav.model.Artist;

import java.util.List;
import java.util.Stack;


public interface ArtistService {
    Stack<Artist> convertToStack();
}
