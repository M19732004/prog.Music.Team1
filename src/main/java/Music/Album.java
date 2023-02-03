package Music;

import java.util.List;
import java.util.Random;

public class Album{

    private List<Songs> songsList;
    private String albumName;

    Random random = new Random();

    private final int id = random.nextInt(999999) + 1;


    public Album(List<Songs> songsList, String albumName) {
        this.songsList = songsList;
        this.albumName= albumName;

    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
