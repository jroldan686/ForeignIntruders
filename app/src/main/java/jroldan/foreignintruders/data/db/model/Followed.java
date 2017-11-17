package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Followed {

    private String user;
    private String followed;

    public Followed(String user, String followed) {
        user = user;
        followed = followed;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        user = user;
    }

    public String getFollowed() {
        return followed;
    }

    public void setFollowed(String followed) {
        followed = followed;
    }

    @Override
    public String toString() {
        return this.user + ":" + this.followed;
    }
}
