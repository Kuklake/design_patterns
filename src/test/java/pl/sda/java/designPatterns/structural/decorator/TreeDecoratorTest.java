package pl.sda.java.designPatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeDecoratorTest {

    @Test
    void shouldBeDecoratedWithGarland() {
        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
        ChristmasTree treeWithGarland = new Garland(nakedTree);

        String decorate = treeWithGarland.decorate();
        System.out.println(decorate);

        assertEquals("Christmas tree with garland", decorate);
    }

    @Test
    void shouldBeDecoratedWithGarlandAndBubbleLights() {
//        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
//        ChristmasTree treeWithGarland = new Garland(nakedTree);
//        ChristmasTree treeWithGarlands = new Garland(treeWithGarland);
//        ChristmasTree treeWithGarlandsAndBubbleLights = new BubbleLights(treeWithGarlands);

        ChristmasTree treeWithGarlandsAndBubbleLights = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));

        String decorate = treeWithGarlandsAndBubbleLights.decorate();
        System.out.println(decorate);

        assertEquals("Christmas tree with garland with garland with bubble lights", decorate);
    }
}