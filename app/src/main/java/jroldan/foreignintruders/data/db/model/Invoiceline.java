package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class Invoiceline {

    private int id;
    private int invoice;
    private int premium;
    private int quantity;
    private float price;

    public Invoiceline(int id, int invoice, int premium, int quantity, float price) {
        this.id = id;
        this.invoice = invoice;
        this.premium = premium;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.id + ":" + this.invoice + ":" + this.premium + ":" + this.quantity + ":" + this.price;
    }
}
