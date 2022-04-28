package pl.sda.java.designPatterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    void shouldReturnSameObjectWithColorBlue() {
        Color color = Color.BLUE;

        Vehicle vehicle1 = VehicleFactory.createVehicle(color);
        Vehicle vehicle2 = VehicleFactory.createVehicle(color);

        assertTrue(vehicle1 == vehicle2);
    }

    @Test
    void shouldReturnDiffObjectsWithDiffColors() {

        Color pink = Color.PINK;
        Color yellow = Color.YELLOW;

        Vehicle vehicle1 = VehicleFactory.createVehicle(pink);
        Vehicle vehicle2 = VehicleFactory.createVehicle(yellow);

        assertFalse(vehicle1 == vehicle2);
    }
}