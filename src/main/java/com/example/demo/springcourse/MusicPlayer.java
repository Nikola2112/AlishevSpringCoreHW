package com.example.demo.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        if (genre == MusicGenre.Classical) {
            System.out.println("Playing Classical Music: " + classicalMusic.getSong());
        } else if (genre == MusicGenre.Rock) {
            System.out.println("Playing Rock Music: " + rockMusic.getSong());
        } else {
            System.out.println("Unsupported music genre");
        }
    }
}
