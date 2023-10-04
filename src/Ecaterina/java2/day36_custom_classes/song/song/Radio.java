package Ecaterina.java2.day36_custom_classes.song.song;

import Ecaterina.java2.day36_custom_classes.song.song.Song;

public class Radio {
    public static void main(String[] args) {
        Song song = new Song("Coldplay", 3.5, "Clocks", "Pop");
        System.out.println(song);

        Song song2 = new Song("Four season", 2.8);
        System.out.println(song2);

    }
}
