package com.example.demo.springcourse;

import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class PopMusic implements  Music  {
    private List<String> songs;

    public PopMusic(){
        songs = new ArrayList<>(Arrays.asList(
                "Kylie Minogue - Padam Padam",
                "Rihanna featuring Jay-Z - Umbrella",
                "Britney Spears - Toxic"
        ));
    }
    public String getRandomSong(){
        int index =(int)(Math.random()*songs.size());
        return songs.get(index);
    }
    @Override
    public String getSong(){
        return getRandomSong();
    }
}
