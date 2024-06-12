package Practica4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class UnderLimitVisitor implements  Visitor {
    private final BigDecimal limitPrice;
    private final Set<Product> visited;
    private int sum;
    private UnderLimitVisitor(BigDecimal limitPrice, Set<Product> visited) {
        this.limitPrice = limitPrice.setScale(2,RoundingMode.HALF_UP);
        this.visited = visited;
        sum = 0;
    }

    public static int priceUnderLimit(Product product, BigDecimal limitPrice) {
        var ulv = new UnderLimitVisitor(limitPrice, new HashSet<>());
        product.accept(ulv);
        return ulv.sum;
    }

    @Override
    public void visit(Pack pack) {
        if (visited.add(pack)) {
            pack.getProducts().forEach(product -> product.accept(this));
        }
    }

    @Override
    public void visit(Item item) {
        if(visited.add(item) && limitPrice.compareTo(item.getPrice()) > 0) {
            sum++;
        }
    }
}
