package pl.sda.java.designPatterns.structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpensiveObjectProxyTest {

    @BeforeEach
    void reset(){
        ExpensiveObjectImpl.resetObjectCount();
    }

    @Test
    void shouldBe() {
        ExpensiveObject object1 = new ExpensiveObjectImpl();
        ExpensiveObject object2 = new ExpensiveObjectImpl();

        object1.process();
        object2.process();

        assertEquals(2, ExpensiveObjectImpl.getObjectsCount());
    }

    @Test
    void shouldBeInitializedOnlyOnce() {
        ExpensiveObject object1 = new ExpensiveObjectProxy();
        ExpensiveObject object2 = new ExpensiveObjectProxy();

        object1.process(); // tu sie tworzy obiekt klasy ExpensiveObjectImpl
        object1.process();
        object2.process();
        object2.process();

        assertEquals(1, ExpensiveObjectImpl.getObjectsCount());
    }
}