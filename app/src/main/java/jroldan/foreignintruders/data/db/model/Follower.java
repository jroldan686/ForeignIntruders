package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Follower {

    private String user;
    private String follower;

    public Follower(String user, String follower) {
        this.user = user;
        this.follower = follower;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    @Override
    public String toString() {
        return this.user + ":" + this.follower;
    }
}
