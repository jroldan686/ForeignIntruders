package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Friend {

    private String user;
    private String friend;

    public Friend(String user, String friend) {
        user = user;
        friend = friend;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        user = user;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        friend = friend;
    }

    @Override
    public String toString() {
        return this.user + ":" + this.friend;
    }
}
