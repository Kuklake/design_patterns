package pl.sda.java.designPatterns.creational.factoryMethod;

public class DomesticPlan extends AbstractPlan {
    @Override
    void getRate() {
        rate = 3.7;
    }
}
