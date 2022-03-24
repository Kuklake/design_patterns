package pl.sda.java.designPatterns.structural.brigde.shape;

import pl.sda.java.designPatterns.structural.brigde.color.Color;
import pl.sda.java.designPatterns.structural.brigde.shape.Shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " square";
    }
}
