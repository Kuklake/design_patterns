package pl.sda.java.designPatterns.creational.factoryMethod;

public class PlanFactory {

    public AbstractPlan getPlan(String planType) {
//        DOMESTIC, COMMERCIAL, INSTITUTIONAL
        if (planType.equals("DOMESTIC")) {
            return new DomesticPlan();
        } else if (planType.equals("COMMERCIAL")) {
            return new CommercialPlan();
        } else if (planType.equals("INSTITUTIONAL")) {
            return new InstitutionalPlan();
        } else {
            return null;
        }
    }
}