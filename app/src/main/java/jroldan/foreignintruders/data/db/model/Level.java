package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Level {

    private int number;
    private int xp;

    public Level(int number, int xp) {
        this.number = number;
        this.xp = xp;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return this.number + ":" + this.xp;
    }
}
