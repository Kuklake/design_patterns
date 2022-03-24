package pl.sda.java.designPatterns.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    void shouldCreateRoundedSquare() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);

        Shape shape = shapeFactory.getShape(ShapeType.SQUARE);
        String draw = shape.draw();
        System.out.println(draw);
        assertEquals("rysuję zaokrąglony kwadracik", draw);
    }

    @Test
    void shouldCreateSquare() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape = shapeFactory.getShape(ShapeType.SQUARE);
        String draw = shape.draw();
        System.out.println(draw);
        assertEquals("rysuję kwadracik", draw);
    }

    @Test
    void shouldCreateRectangle() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        String draw = shape.draw();
        System.out.println(draw);
        assertEquals("rysuję prostokąt", draw);
    }

    @Test
    void shouldCreateRoundedRectangle() {
        boolean rounded = true;
        AbstractFactory shapeFactory = FactoryProducer.getFactory(rounded);

        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        String draw = shape.draw();
        System.out.println(draw);
        assertEquals("rysuję zaokrąglony prostokąt", draw);
    }
}