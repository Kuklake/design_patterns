package pl.sda.java.designPatterns.behavioral.memento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MementoTest {

    private Originator originator = new Originator();
    private CareTaker careTaker = new CareTaker();

    @Test
    void shouldSaveSequenceOfStates() {

        originator.setState(State.NOT_READY);
        originator.setState(State.PREPARING);
        careTaker.add(originator.save());

        originator.setState(State.READY);
        careTaker.add(originator.save());

        originator.setState(State.CANCELED);
        State currentState = originator.getState();

        originator.restore(careTaker.get(0));
        State firstSavedState = originator.getState();
        originator.restore(careTaker.get(1));
        State secondSavedState = originator.getState();

        System.out.println(careTaker.getAllStates());

        assertEquals(State.CANCELED, currentState);
        assertEquals(State.PREPARING, firstSavedState);
        assertEquals(State.READY, secondSavedState);
    }
}