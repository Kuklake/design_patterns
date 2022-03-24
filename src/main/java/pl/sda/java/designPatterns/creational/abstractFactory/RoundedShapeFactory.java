package pl.sda.java.designPatterns.creational.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case SQUARE:
                return new RoundedSquare();
            case RECTANGLE:
                return new RoundedRectangle();
            default:
                return null;
        }
    }
}
