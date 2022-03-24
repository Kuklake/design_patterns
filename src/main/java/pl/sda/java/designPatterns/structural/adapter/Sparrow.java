package pl.sda.java.designPatterns.structural.adapter;

public class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Shrek, ja latam!");
    }

    @Override
    public String getSound() {
        return "ćwirk ćwirk";
    }
}
