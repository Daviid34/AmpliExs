package recu17_18;

public class PriceChanged {
    private final float oldPrice;
    private final float newPrice;

    public PriceChanged(float oldPrice, float newPrice) {
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }
    public float getOldPrice(){ return this.oldPrice; }
    public float getNewPrice() { return this.newPrice; }
}
