package com.example.demo.springcourse;

public enum MusicGenre{
    CLASSICAL(new ClassicalMusic()),
    ROCK(new RockMusic()),
    POP(new PopMusic());

    private final Music music;

    MusicGenre(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
}
