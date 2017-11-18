package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Statistic {

    private String name;
    private String description;

    public Statistic(String name, String description) {
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        return this.name + ":" + this.description;
    }
}
