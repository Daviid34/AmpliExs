package Practica4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item implements Product {
    private BigDecimal price;
    public Item(BigDecimal price) {
        //No ficar setPrice perquè el mètode és polymorphic (qualsevol subclasse ho podria implementar)
        //i donaria problemes amb més subclasses
        //MAI CRIDAR MÈTODES POLIMÒRFICS (privats i statics sí)
        //setPrice(price);
        var scaled = price.setScale(2,	RoundingMode.HALF_UP);
        if (price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price lower or equal to 0");
        }
        this.price = scaled;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        var scaled = price.setScale(2,	RoundingMode.HALF_UP);
        if (price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price lower or equal to 0");
        }
        this.price = scaled;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
