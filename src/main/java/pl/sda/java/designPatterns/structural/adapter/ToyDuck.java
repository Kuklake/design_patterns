package pl.sda.java.designPatterns.structural.adapter;

public interface ToyDuck {
    String getSqueakSound();

    default void squeak() {
        System.out.println("toy duck: " + getSqueakSound());
    }
}
