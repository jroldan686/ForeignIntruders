package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Progress {

    private String user;
    private String statistic;
    private float percentage;

    public Progress(String user, String statistic, float percentage) {
        user = user;
        statistic = statistic;
        percentage = percentage;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        user = user;
    }

    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        statistic = statistic;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        percentage = percentage;
    }

    @Override
    public String toString() {
        return this.user + ":" + this.statistic + ":" + this.percentage;
    }
}
