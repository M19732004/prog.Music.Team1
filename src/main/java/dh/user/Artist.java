package dh.user;

import dh.content.Album;
import dh.content.Song;

import java.util.Date;
import java.util.List;

public class Artist extends User {

    private String name;
    private String bio;
    private List<Album> albumOfArtist;
    private List<Song> songOfArtist;

    public Artist() {
        super();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Album> getAlbumOfArtist() {
        return albumOfArtist;
    }

    public void setAlbumOfArtist(List<Album> albumOfArtist) {
        this.albumOfArtist = albumOfArtist;
    }

    public List<Song> getSongOfArtist() {
        return songOfArtist;
    }

    public void setSongOfArtist(List<Song> songOfArtist) {
        this.songOfArtist = songOfArtist;
    }
}
