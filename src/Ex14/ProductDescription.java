package Ex14;

public class ProductDescription {
    private String description;
    private int price;
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }

    public SLI createSLI(int quantity) {
        if (price < 2) return new CincuentaPorCiento(this, quantity);
        return new DosPorUno(this, quantity);
    }
}
