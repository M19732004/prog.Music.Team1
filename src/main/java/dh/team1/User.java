package dh.team1;

import javax.xml.crypto.Data;
import java.util.Random;

public class User extends Account{

    private boolean online;

    Random random = new Random();

    private final int id = random.nextInt(999999) + 1;

    public User(String usurname, String email, String password, String nationality, String genre, Data dateOfBirth, boolean online) {
        super(usurname, email, password, nationality, genre, dateOfBirth);
        this.online = online;
    }

}
