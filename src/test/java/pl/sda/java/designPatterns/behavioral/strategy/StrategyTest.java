package pl.sda.java.designPatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    private final LocalDate ESTERN = LocalDate.of(2022, 4, 24);
    private final LocalDate CHRISTMASS = LocalDate.of(2022, 12, 24);
    private final LocalDate OTHER = LocalDate.of(2022, 1, 24);

    @Test
    void shouldUseEasterDiscount() {
        Discounter discounter = StrategyPicker.chooseDiscounter(ESTERN);
        BigDecimal amountWithDiscount = discounter.applyDiscount(BigDecimal.valueOf(120));

        System.out.println(amountWithDiscount);
        assertEquals(BigDecimal.valueOf(60d), amountWithDiscount);
    }

    @Test
    void shouldUseChristmassDiscount() {
        Discounter discounter = StrategyPicker.chooseDiscounter(CHRISTMASS);
        BigDecimal amountWithDiscount = discounter.applyDiscount(BigDecimal.valueOf(120));

        System.out.println(amountWithDiscount);
        assertEquals(BigDecimal.valueOf(108d), amountWithDiscount);
    }

    @Test
    void shouldUseDefaultDiscount() {
        Discounter discounter = StrategyPicker.chooseDiscounter(OTHER);
        BigDecimal amountWithDiscount = discounter.applyDiscount(BigDecimal.valueOf(120));

        System.out.println(amountWithDiscount);
        assertEquals(BigDecimal.valueOf(120), amountWithDiscount);
    }
}