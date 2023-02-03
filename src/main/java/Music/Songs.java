package Music;

import dh.team1.Artist;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;

public class Songs  {

    private Artist artistName;

    private double time;
    private String name;
    Random random = new Random();
    private final int id = random.nextInt(999999) + 1;

    public Songs(String songName, double timeSongs) {
        this.name = songName;
        this.time= timeSongs;

    }

    public String getNameAndId(){
        return name + id;
    }

}
