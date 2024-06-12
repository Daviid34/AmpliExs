package Ex4;

public class Money {
    private final int cost;
    public Money (int cost) {
        this.cost = cost;
    }

    public boolean isPositive() {
        return this.cost >= 0;
    }

    public Money add(Money m) {
        return new Money(m.cost + this.cost);
    }
}
