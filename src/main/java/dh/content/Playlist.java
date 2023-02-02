package dh.content;

import dh.user.User;

import java.util.Date;
import java.util.List;

public class Playlist {
    private String idPlaylist;
    private String title;
    private User creator;
    private List<Song> songsOfAlbum;
    private Date publicationDate;

    public Playlist(String idPlaylist, String title, User creator, List<Song> songsOfAlbum, Date publicationDate) {
        this.idPlaylist = idPlaylist;
        this.title = title;
        this.creator = creator;
        this.songsOfAlbum = songsOfAlbum;
        this.publicationDate = publicationDate;
    }

    public String getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(String idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<Song> getSongsOfAlbum() {
        return songsOfAlbum;
    }

    public void setSongsOfAlbum(List<Song> songsOfAlbum) {
        this.songsOfAlbum = songsOfAlbum;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}
