package dh.team1;

import javax.xml.crypto.Data;

public class Account {

    private String usurname;
    private String email;
    private String password;
    private String nationality;
    private String genre;
    private Data dateOfBirth;

    public Account(String usurname, String email, String password, String nationality, String genre, Data dateOfBirth) {
        this.setUsurname(usurname);
        this.setEmail(email);
        this.setPassword(password);
        this.setNationality(nationality);
        this.setGenre(genre);
        this.setDateOfBirth(dateOfBirth);
    }

    public String getUsurname() {
        return usurname;
    }

    public void setUsurname(String usurname) {
        this.usurname = usurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Data getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Data dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
