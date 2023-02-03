package dh.user;

import java.util.Date;
import java.util.List;

public class Admin extends User {

    private int accessLevel;
    private List<LogAction> log;

    public Admin() {
        super();
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public List<LogAction> getLog() {
        return log;
    }

    public void setLog(List<LogAction> log) {
        this.log = log;
    }
}
