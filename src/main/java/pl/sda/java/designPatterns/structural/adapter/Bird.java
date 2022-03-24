package pl.sda.java.designPatterns.structural.adapter;

public interface Bird {
    void fly();
    String getSound();

    default void makeSound() {
        System.out.println("bird: " + getSound());
    }
}
