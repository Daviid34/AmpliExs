package recu17_18;

import java.util.Observable;

public abstract class Product extends Observable {
    abstract float getPrice();
    abstract boolean hasFinished();
}
