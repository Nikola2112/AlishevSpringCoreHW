package com.example.demo.springcourse;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
    private List<MusicGenre> musicGenres;

    public MusicPlayer(List<MusicGenre> musicGenres) {
        this.musicGenres = musicGenres;
    }

    public void playMusic() {
        if (musicGenres.isEmpty()) {
            System.out.println("No music genres available");
            return;
        }
        Random random = new Random();
        MusicGenre randomGenre = musicGenres.get(random.nextInt(musicGenres.size()));
        System.out.println("Playing music from genre: " + randomGenre);
    }
}
