package pl.sda.java.designPatterns.structural.brigde.shape;

import pl.sda.java.designPatterns.structural.brigde.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
