package recu22_23;

public class Item implements Product {
    private double price;

    public Item(double price) {
        //no cridar a setPrice que es un metode polimorfic
        if (price <= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPrice(double price) {
        if (price <= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getPrice() {
        return price;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
