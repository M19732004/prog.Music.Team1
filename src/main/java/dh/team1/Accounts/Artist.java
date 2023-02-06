package dh.team1.Accounts;

import dh.team1.Music.Album;

public class Artist extends Account{

    Album albums;

    Artist(String name, String surname, int age, String nationality, String username) {
        super(name, surname, age, nationality, username);

    }
}
