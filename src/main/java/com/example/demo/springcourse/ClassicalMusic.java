package com.example.demo.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
    private List<String> songs;

    public ClassicalMusic() {
        songs = new ArrayList<>(Arrays.asList(
                "Hungarian Rhapsody",
                "Beethoven - Symphony No. 9",
                "Mozart - Eine kleine Nachtmusik"
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
