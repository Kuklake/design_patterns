package pl.sda.java.designPatterns.structural.brigde;

import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.structural.brigde.color.Blue;
import pl.sda.java.designPatterns.structural.brigde.color.Red;
import pl.sda.java.designPatterns.structural.brigde.shape.Circle;
import pl.sda.java.designPatterns.structural.brigde.shape.Shape;
import pl.sda.java.designPatterns.structural.brigde.shape.Square;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void shouldDrawRedCircle() {
        Shape circle = new Circle(new Red());
        System.out.println(circle.draw());

        assertEquals("red circle", circle.draw());
    }

    @Test
    void shouldDrawBlueCircle() {
        Shape circle = new Circle(new Blue());
        System.out.println(circle.draw());

        assertEquals("blue circle", circle.draw());
    }

    @Test
    void shouldDrawRedSquare() {
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        assertEquals("red square", square.draw());
    }
}