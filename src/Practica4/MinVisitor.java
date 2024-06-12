package Practica4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MinVisitor implements Visitor {
    private final BigDecimal minItemPrice;
    private MinVisitor(BigDecimal minItemPrice){
        this.minItemPrice = minItemPrice;
    }

    public static void limitItemPrice(Product p, BigDecimal minItemPrice) {
        //Considero que qualsevol cosa per sota de 0.01 com s'haurà d'escalar, és 0
        var scaled = minItemPrice.setScale(2,	RoundingMode.HALF_UP);
        if (scaled.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price lower or equal to 0");
        }
        var mv = new MinVisitor(minItemPrice);
        p.accept(mv);
    }

    @Override
    public void visit(Pack pack) {
        pack.getProducts().forEach(product -> product.accept(this));
    }

    @Override
    public void visit(Item item) {
        var current = item.getPrice();
        if (minItemPrice.compareTo(current) > 0) {
            item.setPrice(minItemPrice);
        }
    }
}
