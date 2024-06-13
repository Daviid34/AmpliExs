package recu17_18;

public class Item extends Product {
    private boolean finished = false;
    private float price;
    private PriceChanged pc;

    public Item (float price) {
        this.price = price;
    }

    public void setPrice(float price) {
        pc = new PriceChanged(this.price, price);
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public boolean hasFinished() {
        return finished;
    }

    public void finish() {
        if (!finished) {
            finished = true;
            setChanged();
            notifyObservers(pc);
        }
    }
}
