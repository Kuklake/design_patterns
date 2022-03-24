package pl.sda.java.designPatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdAdapterTest {

    @Test
    void birdShouldBehaveLikeAToyDuck() {
        Bird sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        BirdAdapter birdAdapter = new BirdAdapter(sparrow);

        sparrow.makeSound();
        toyDuck.squeak();
        birdAdapter.squeak();

        assertEquals(sparrow.getSound(), birdAdapter.getSqueakSound());
    }
}