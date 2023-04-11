package com.example.chooseFav.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ARTIST")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "artist",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @Column(nullable = true)
    @JsonManagedReference
    private List<Music> musicCollection = new ArrayList<>();

    private String Artistname;
    private String photo;


    public Artist() {

    }
    public void addMusic(Music m){
        this.musicCollection.add(m);
    }

    public Artist(Long id, String artistname, String photo) {
        this.id = id;
        Artistname = artistname;
        this.photo = photo;
    }

    public Artist(Long id, List<Music> musicCollection, String artistname, String photo) {
        this.id = id;
        this.musicCollection = musicCollection;
        Artistname = artistname;
        this.photo = photo;
    }

    public Artist(String artistname, String photo) {
        this.Artistname = artistname;
        this.photo = photo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Music> getMusicCollection() {
        return musicCollection;
    }

    public void setMusicCollection(List<Music> musicCollection) {
        this.musicCollection = musicCollection;
    }

    public String getArtistname() {
        return Artistname;
    }

    public void setArtistname(String artistname) {
        Artistname = artistname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", musicCollection=" + musicCollection +
                ", Artistname='" + Artistname + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
