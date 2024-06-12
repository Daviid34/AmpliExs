package Practica4;

import java.math.BigDecimal;

public interface Product {
    BigDecimal getPrice();
    void setPrice(BigDecimal price);
    void accept(Visitor visitor);
}
