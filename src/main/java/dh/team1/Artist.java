package dh.team1;

import java.util.Random;

public class Artist {

    private String description;
    private String name;
    Random random = new Random();
    private final int id = random.nextInt(999999) + 1;


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

}
