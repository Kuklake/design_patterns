package pl.sda.java.designPatterns.creational.factoryMethod;

public class PlanFactory {

    public AbstractPlan getPlan(Plan plan) {

        AbstractPlan abstractPlan = switch (plan) {
            case DOMESTIC -> new DomesticPlan();
            case COMMERCIAL -> new CommercialPlan();
            case INSTITUTIONAL ->  new InstitutionalPlan();
            default ->  null;
        };
        return abstractPlan;
    }
}