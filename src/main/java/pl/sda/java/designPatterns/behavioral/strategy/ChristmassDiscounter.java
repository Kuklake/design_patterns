package pl.sda.java.designPatterns.behavioral.strategy;

import java.math.BigDecimal;

public class ChristmassDiscounter implements Discounter {

    private final BigDecimal DISCOUNT = BigDecimal.valueOf(0.9);

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(DISCOUNT);
    }
}
