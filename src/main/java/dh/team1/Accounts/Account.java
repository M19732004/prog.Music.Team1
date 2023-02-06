package dh.team1.Accounts;

import dh.team1.Music.Album;
import dh.team1.Music.Song;

import java.util.List;
import java.util.Scanner;

public  abstract class Account {

    String name;
    String surname;
    int age;
    String nationality;


    //Username and password:
    String Username;
    String password;

    String email;

    //Playlist:
    List<Song> playlistSongs;
    List<Album> playlistAlbums;

    Scanner scanner = new Scanner(System.in);


    Account(String name, String surname, int age, String nationality, String username, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
        this.email= email;

        this.surname = username;
    }

    void getName() {
        System.out.println(name);
    }

    void getSurname() {
        System.out.println(surname);
    }

    void getAge() {
        System.out.println(age);
    }

    void getNationality() {
        System.out.println(nationality);
    }

    void getUsername() {
        System.out.println(Username);
    }

    //TODO
    public String setPassword() {
        boolean passwordisCheck = false;
        String password = scanner.nextLine();


        while (passwordisCheck == true) {
        }



              return this.password = password;


    }

    List<Song> addPlaylistsSongs(Song song) {
        playlistSongs.add(song);
        return playlistSongs;
    }

    //TODO
    List<Song> getPlaylists() {
        return playlistSongs;
    }

    List<Album> addPlaylistsAlbums(Album album) {
        playlistAlbums.add(album);
        return playlistAlbums;
    }

    //TODO
    List<Album> getPlaylists(Album album) {

        return playlistAlbums;
    }







}