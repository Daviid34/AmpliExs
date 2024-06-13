package recu17_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Pack extends Product implements Observer {
    private float discount;
    private final List<Product> products;

    public Pack (float discount) {
        this.discount = discount;
        products = new ArrayList<>();
    }

    public float getPrice() {
        float count = 0;
        for (Product p : products) {
            count += p.getPrice();
        }
        return count;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float newDiscount) {
        this.discount = newDiscount;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void update (Observable o, Object args) {
        if (hasFinished()) {
            setChanged();
            notifyObservers(args);
        }
    }

    public boolean hasFinished() {
        return products.stream().allMatch(Product::hasFinished);
    }
}
