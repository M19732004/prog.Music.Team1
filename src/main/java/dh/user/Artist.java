package dh.user;

import java.util.Date;
import java.util.List;

public class Artist extends User {

    private String name;
    private String bio;
    private List<String> album;
    private List<String> songs;

    public Artist(String username, String password, String email, Date creation_date, boolean loggedIn, Generality generality, String name, String bio, List<String> album, List<String> songs) {
        super(username, password, email, creation_date, loggedIn, generality);
        this.name = name;
        this.bio = bio;
        this.album = album;
        this.songs = songs;
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

    public List<String> getAlbum() {
        return album;
    }

    public void setAlbum(List<String> album) {
        this.album = album;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
