package pl.sda.java.designPatterns.structural.brigde.shape;

import pl.sda.java.designPatterns.structural.brigde.color.Color;


public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " circle";
    }
}
