package recu22_23;

public interface Product {
    double getPrice();
    void accept(Visitor v);
}
