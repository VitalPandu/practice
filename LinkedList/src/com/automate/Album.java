package com.automate;

import java.util.ArrayList;

public class Album {

       private String name;
       private String Artist;
       private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        Artist = artist;
        songs=new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration){
        if(findSong(title)==null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title));
            return checkedSong;
        }
        return null;
    }

     
}
