package pl.sda.java.designPatterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    private Spouse wife = new Spouse("Marry", Role.WIFE);
    private Spouse husband = new Spouse("John", Role.HUSBAND);

    @Test
    void wifeShouldLoveHerHusband() {
        String msgText = "you are so distant!";
        String msg = wife.sendMsg(msgText);

        assertEquals(Mediator.MSG_PREFIX + msgText, msg);
    }

    @Test
    void husbandShouldLoveHisWife() {
        String msgText = "you cannot talk so much!";
        String msg = husband.sendMsg(msgText);

        assertEquals(Mediator.MSG_PREFIX + msgText, msg);
    }
}