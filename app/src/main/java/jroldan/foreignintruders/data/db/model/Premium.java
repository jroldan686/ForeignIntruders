package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Premium {

    private int id;
    private String name;
    private String characteristics;
    private float price;

    public Premium(int id, String name, String characteristics, float price) {
        this.id = id;
        this.name = name;
        this.characteristics = characteristics;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.id + ":" + this.name + ":" + this.characteristics + ":" + this.price;
    }
}
