package com.example.demo.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class RockMusic implements Music {
    private List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>(Arrays.asList(
                "Wind cries Mary",
                "Queen - Bohemian Rhapsody",
                "Led Zeppelin - Stairway to Heaven"
        ));
    }

    private String getRandomSong() {
        int index = (int) (Math.random() * songs.size());
        return songs.get(index);
    }

    @Override
    public String getSong() {
        return getRandomSong();
    }
}
