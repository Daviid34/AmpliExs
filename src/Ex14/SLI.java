package Ex14;

public class SLI {
    private ProductDescription desc;
    private int quantity;
    public SLI(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }
    public int subTotal() {
        return desc.getPrice() * quantity;
    }
}
