package pl.sda.java.designPatterns.creational.factoryMethod;

public abstract class AbstractPlan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int unit) {
        System.out.println(unit * rate);
    }
}
