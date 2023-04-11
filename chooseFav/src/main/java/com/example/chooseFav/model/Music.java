package com.example.chooseFav.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "MUSIC")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdMusic;



    private String name;


    private String Url;

    private String Path;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    @JsonBackReference
    private Artist artist;
    public Music() {
    }

    public Music(Long idMusic, String url, String path) {
        IdMusic = idMusic;
        Url = url;
        Path = path;
    }

    public Music(String name, String url, String path) {
        this.name = name;
        Url = url;
        Path = path;
    }

    public Long getIdMusic() {
        return IdMusic;
    }

    public void setIdMusic(Long idMusic) {
        IdMusic = idMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Music(String name, String url, String path, Artist artist) {
        this.name = name;
        Url = url;
        Path = path;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "IdMusic=" + IdMusic +
                ", name='" + name + '\'' +
                ", Url='" + Url + '\'' +
                ", Path='" + Path + '\'' +
                ", artist=" + artist +
                '}';
    }
}
