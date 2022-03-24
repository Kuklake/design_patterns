package pl.sda.java.designPatterns.creational.factoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void shouldCreateDomesticPlan() {
        PlanFactory planFactory = new PlanFactory();
        AbstractPlan domestic = planFactory.getPlan(Plan.DOMESTIC);
        assertEquals("" + 3.7, domestic.calculateBill(1));
    }

    @Test
    void shouldCreateCommercialPlan() {
        PlanFactory planFactory = new PlanFactory();
        AbstractPlan domestic = planFactory.getPlan(Plan.COMMERCIAL);
        assertEquals("" + 5.4, domestic.calculateBill(1));
    }

    @Test
    void shouldCreateInstitutionalPlan() {
        PlanFactory planFactory = new PlanFactory();
        AbstractPlan domestic = planFactory.getPlan(Plan.INSTITUTIONAL);
        assertEquals("" + 4.8, domestic.calculateBill(1));
    }
}