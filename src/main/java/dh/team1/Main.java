package dh.team1;

import dh.content.Album;
import dh.content.Content;
import dh.content.GenericMethods;
import dh.content.Song;


public class Main {
    public static void main(String[] args) {
        Content song = new Song();
        Content album = new Album();
        GenericMethods<Content> f = new GenericMethods<Content>();
        f.play(song);
        f.play(album);
    }
}