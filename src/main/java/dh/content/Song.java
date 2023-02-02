package dh.content;

import dh.user.Artist;

import java.util.Date;

public class Song {
    private String idSong;
    private String title;
    private float length;
    private Date publicationDate;
    private Artist artistOfSong;
    private Album albumOfSong;

    public Song(String idSong, String title, float length, Date publicationDate, Artist artistOfSong, Album albumOfSong) {
        this.idSong = idSong;
        this.title = title;
        this.length = length;
        this.publicationDate = publicationDate;
        this.artistOfSong = artistOfSong;
        this.albumOfSong = albumOfSong;
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Artist getArtistOfSong() {
        return artistOfSong;
    }

    public void setArtistOfSong(Artist artistOfSong) {
        this.artistOfSong = artistOfSong;
    }

    public Album getAlbumOfSong() {
        return albumOfSong;
    }

    public void setAlbumOfSong(Album albumOfSong) {
        this.albumOfSong = albumOfSong;
    }
}
