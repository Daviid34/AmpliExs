package recu22_23;

public class MinVisitor implements Visitor {
    private double minPrice;

    private MinVisitor(double minPrice) {
        this.minPrice = minPrice;
    }

    public static void limitItemPrice(Product p, double minPrice) {
        MinVisitor mv = new MinVisitor(minPrice);
        p.accept(mv);
    }

    public void visit(Item item) {
        if (item.getPrice() < minPrice) {
            item.setPrice(minPrice);
        }
    }

    public void visit(Pack pack) {
        pack.getProducts().forEach(product -> product.accept(this));
    }
}
