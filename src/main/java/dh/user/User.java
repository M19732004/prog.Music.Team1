package dh.user;

import java.util.Date;

public class User {

    private String username;
    private String password;
    private String email;
    private Date creation_date;
    private boolean loggedIn;
    private Generality generality;

    public User(String username, String password, String email, Date creation_date, boolean loggedIn, Generality generality) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.creation_date = creation_date;
        this.loggedIn = loggedIn;
        this.generality = generality;
    }


    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public Generality getGenerality() {
        return generality;
    }

    public void setGenerality(Generality generality) {
        this.generality = generality;
    }
}
