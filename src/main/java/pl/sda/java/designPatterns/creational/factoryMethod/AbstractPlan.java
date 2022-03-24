package pl.sda.java.designPatterns.creational.factoryMethod;

public abstract class AbstractPlan {
    protected double rate;

    abstract double getRate();

    public String calculateBill(int unit) {
        double x = (double)unit * getRate();
        System.out.println(x);
        return "" + x;
    }
}
