package Account;

public class Admin extends Account {

    private User user;


    public Admin(String username, String password, String email) {
        super(username, password, email);
    }

    public void setUserName(String username){
        this.username = username;
    }
}
