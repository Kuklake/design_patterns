package pl.sda.java.designPatterns.creational.prototype.deep;

import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.creational.prototype.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeepPrototypeTest {

    @Test
    void shouldCreateDeepCopyOfCircle() {

        Circle original = new Circle();
        Point centralPoint = new Point(3, 4);
        original.setCentralPoint(centralPoint);
        original.setColor("red");

        Circle clone = original.clone();

//        System.out.println("przed zmianą");
//        System.out.println("original: " + original);
//        System.out.println("clone: " + clone);
//
//        centralPoint.setX(5);
//        original.setColor("blue");
//        System.out.println("po zmianą");
//        System.out.println("original: " + original);
//        System.out.println("clone: " + clone);

        assertEquals(original.getColor(), clone.getColor());
        assertEquals(original.getRadius(), clone.getRadius());
        assertFalse(original.getCentralPoint() == clone.getCentralPoint());
    }
}
