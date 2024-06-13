package recu22_23;

import java.util.HashSet;
import java.util.Set;

public class UnderLimitVisitor implements Visitor {
    private double minPrice;
    private int count;
    private final Set<Product> visited;

    private UnderLimitVisitor(Set<Product> visited, double minPrice) {
        this.count = 0;
        this.minPrice = minPrice;
        this.visited = visited;
    }

    public static int priceUnderLimit(Product p, double minPrice) {
        UnderLimitVisitor ulv = new UnderLimitVisitor(new HashSet<>(), minPrice);
        p.accept(ulv);
        return ulv.count;
    }

    public void visit(Item item) {
        if (visited.add(item) && item.getPrice() < minPrice) {
            count += 1;
        }
    }

    public void visit(Pack pack) {
        if(visited.add(pack)) {
            pack.getProducts().forEach(product -> product.accept(this));
        }
    }
}
