package com.example.demo.springcourse;

public class TestSpring {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic(), new RockMusic());

        musicPlayer.playMusic(MusicGenre.Classical);
        musicPlayer.playMusic(MusicGenre.Rock);
    }
}

