package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Found {

    private String user;
    private int hidden;
    private String date;

    public Found(String user, int hidden, String date) {
        user = user;
        hidden = hidden;
        date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        user = user;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        hidden = hidden;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        date = date;
    }

    @Override
    public String toString() {
        return this.user + ":" + this.hidden + ":" + this.date;
    }
}
