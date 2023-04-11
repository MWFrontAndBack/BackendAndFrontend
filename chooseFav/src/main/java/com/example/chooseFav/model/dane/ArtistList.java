package com.example.chooseFav.model.dane;

import com.example.chooseFav.model.Artist;
import com.example.chooseFav.service.ArtistSeviceImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;
import java.util.Stack;

@Getter
@Setter
@Component
@SessionScope
public class ArtistList {
    private final ArtistSeviceImpl artistSevice;
    private Stack<Artist> arts;

    public ArtistList(ArtistSeviceImpl artistSevice) {
        this.artistSevice = artistSevice;
        this.arts = artistSevice.convertToStack();
    }
}
