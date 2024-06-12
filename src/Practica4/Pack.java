package Practica4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pack implements Product {
    private final List<Product> products;

    public Pack() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        Objects.requireNonNull(product);
        //Aquí calia raonar si afegir els productes com a còpia o només el punter
        //si es copia després s'ha de canviar per l'apartat (c)
        products.add(product);
    }

    public void setPrice(BigDecimal price) {
        for (Product product: products) {
            product.setPrice(price);
        }
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : products) {
            total = total.add(product.getPrice());
        }
        return total.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
