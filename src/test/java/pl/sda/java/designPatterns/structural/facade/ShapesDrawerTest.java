package pl.sda.java.designPatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesDrawerTest {

    @Test
    void shouldDrawCircle() {
        ShapesDrawer shapesDrawer = new ShapesDrawer();

        String circleDraw = shapesDrawer.drawCircle();
        System.out.println(circleDraw);

        assertEquals("drawing circle", circleDraw);
    }

    @Test
    void shouldDrawAllShapes() {
//        given
        ShapesDrawer shapesDrawer = new ShapesDrawer();

//        when
        String shapesDraw = shapesDrawer.drawShapes();
        System.out.println(shapesDraw);

//        then
        assertEquals("drawing circle,drawing rectangle,drawing square", shapesDraw);
    }
}