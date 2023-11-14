package com.example;

import java.util.Arrays;
import java.util.List;


public class TestSpring {
    public static void main(String[] args) {
        List<MusicGenre> genres = Arrays.asList(MusicGenre.CLASSICAL, MusicGenre.ROCK, MusicGenre.POP);
        MusicPlayer musicPlayer = new MusicPlayer(genres);
        musicPlayer.playMusic();
    }
}


