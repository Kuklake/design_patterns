package pl.sda.java.designPatterns.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
