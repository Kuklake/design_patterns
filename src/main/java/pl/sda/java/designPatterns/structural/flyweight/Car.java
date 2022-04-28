package pl.sda.java.designPatterns.structural.flyweight;

import java.awt.*;

public class Car implements Vehicle {
    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}