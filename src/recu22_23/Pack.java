package recu22_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pack implements Product {
    private List<Product> products;

    public Pack() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        Objects.requireNonNull(p);
        products.add(p);
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public double getPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
