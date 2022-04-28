package pl.sda.java.designPatterns.behavioral.templateMethod;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {

    private final String MOTHERBOARD = "motherboard";
    private final String PROCESSOR = "processor";

    @Test
    void shouldBuildStandardComputer() {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();

        Computer computer = standardComputerBuilder.buildComputer();
        Map<String, String> computerParts = computer.getComputerParts();

        System.out.println(computerParts);
        assertEquals("standard motherboard", computerParts.get(MOTHERBOARD));
        assertEquals("standard procesorr", computerParts.get(PROCESSOR));
    }

    @Test
    void shouldBuildHighEndComputer() {
        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer computer = highEndComputerBuilder.buildComputer();

        Map<String, String> computerParts = computer.getComputerParts();
        System.out.println(computerParts);

        assertEquals("super motherboard", computerParts.get(MOTHERBOARD));
        assertEquals("super processor", computerParts.get(PROCESSOR));
    }
}