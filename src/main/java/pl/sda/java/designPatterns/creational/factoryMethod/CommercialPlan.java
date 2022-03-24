package pl.sda.java.designPatterns.creational.factoryMethod;

public class CommercialPlan extends AbstractPlan {
    @Override
    void getRate() {
        rate = 5.4;
    }
}
