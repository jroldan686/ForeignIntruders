package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Obtained {

    private String user;
    private String achievement;
    private String date;

    public Obtained(String user, String achievement, String date) {
        user = user;
        achievement = achievement;
        date = date;
    }

    public String getUser() {

        return user;
    }

    public void setUser(String user) {
        user = user;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        achievement = achievement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        date = date;
    }

    @Override
    public String toString() {
        return this.user + ":" + this.achievement + ":" + this.date;
    }
}
