package Ex4and8;

public class Simple extends Task{
    private Money cost;
    private int duration;
    private boolean hasFinished;

    public Simple(Money money, int duration) {
        if (duration <= 0 || money == null || !money.isPositive()) {
            throw new IllegalArgumentException("Bad Simple");
        }
        this.cost = money;//Només es pot fer això si Money es immutable, sino s'hauria de fer una copia
        this.duration = duration;
    }

    @Override
    public Money costInEuros() {
        return this.cost;
    }

    @Override
    public int durationInDays() {
        return this.duration;
    }

    @Override
    public boolean hasFinished() {
        return hasFinished;
    }

    public void finish() {
        if (!hasFinished) {
            hasFinished = true;
            setChanged();
            notifyObservers();
        }
    }
}
