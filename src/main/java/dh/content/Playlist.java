package dh.content;

import dh.user.User;

import java.util.Date;
import java.util.List;

public class Playlist {
    String idPlaylist;
    String title;
    User creator;
    List<Song> songsOfAlbum;
    Date publicationDate;
}
