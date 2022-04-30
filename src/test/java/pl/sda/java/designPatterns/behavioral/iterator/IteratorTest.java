package pl.sda.java.designPatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    void shouldIterateOverNames() {
        StringContainer container = new StringContainer();

        List<String> names = new ArrayList<>();

        for (Iterator<String> iter = container.getIterator(); iter.hasNext(); ) {
            String name = iter.next();
            names.add(name);
        }

        assertTrue(names.size() == 4);
        assertTrue(names.contains("Zofia"));
        assertTrue(names.contains("Staś"));
        assertTrue(names.contains("Antek"));
        assertTrue(names.contains("Kazio"));
    }
}