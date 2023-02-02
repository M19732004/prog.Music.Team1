package dh.content;

import dh.user.Artist;

import java.util.Date;
import java.util.List;

public class Album {
    String idAlbum;
    String title;
    Artist artist;
    List<Song> songsOfAlbum;
    Date publicationDate;
}
