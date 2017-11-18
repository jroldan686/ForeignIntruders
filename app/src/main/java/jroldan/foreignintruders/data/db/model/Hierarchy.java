package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Hierarchy {

    private String name;
    private String description;
    private int xp;
    private String unlock;

    public Hierarchy(String name, String description, int xp, String unlock) {
        this.name = name;
        this.description = description;
        this.xp = xp;
        this.unlock = unlock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getUnlock() {
        return unlock;
    }

    public void setUnlock(String unlock) {
        this.unlock = unlock;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.description + ":" + this.xp + ":" + this.unlock;
    }
}
