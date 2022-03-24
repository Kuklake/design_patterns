package pl.sda.java.designPatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShallowPrototypeTest {

    @Test
    void shouldCreateShallowCopy() {
        RectangleCloneable rectangle = new RectangleCloneable(4, 5);

        Point point = new Point(12,13);
        rectangle.setPoint(point);

        RectangleCloneable clone = rectangle.clone();

        System.out.println("original: " + rectangle);
        System.out.println("clone: " + clone);

        point.setX(14);

        System.out.println("original: " + rectangle);
        System.out.println("clone: " + clone);

//        rectangle.setWidth(6);
//        rectangle.setHeight(7);
//
//        System.out.println(rectangle);
//        System.out.println(clone);

        assertEquals(rectangle.getHeight(), clone.getHeight());
        assertEquals(rectangle.getWidth(), clone.getWidth());
        assertTrue(rectangle.getPoint() == clone.getPoint());
    }
}