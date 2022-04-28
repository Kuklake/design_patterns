package pl.sda.java.designPatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class ShapesDrawer {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapesDrawer() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public String drawCircle(){
        return circle.draw();
    }

    public String drawRectangle(){
        return rectangle.draw();
    }

    public String drawSquare(){
        return square.draw();
    }

    public String drawShapes(){
        List<String> drawers = Arrays.asList(
                circle.draw(),
                rectangle.draw(),
                square.draw());
        String joinedDrawers = String.join(",", drawers);

        return joinedDrawers;
    }
}
