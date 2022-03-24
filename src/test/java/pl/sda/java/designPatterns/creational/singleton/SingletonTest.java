package pl.sda.java.designPatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void shouldCreateOnlyOneInstance() {

        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        assertTrue(first == second);

    }
}