package dh.user;

import java.util.Date;

public class LogAction {

    private String action;
    private Date date_action;
    private User admin;
    private String details;

    public LogAction(String action, Date date_action, User admin, String details) {
        this.action = action;
        this.date_action = date_action;
        this.admin = admin;
        this.details = details;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getDate_action() {
        return date_action;
    }

    public void setDate_action(Date date_action) {
        this.date_action = date_action;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
