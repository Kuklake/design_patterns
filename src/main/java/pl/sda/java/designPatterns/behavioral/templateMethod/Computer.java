package pl.sda.java.designPatterns.behavioral.templateMethod;

import java.util.Map;

public class Computer {

    private Map<String, String> computerParts;

    public Computer(Map<String, String> computerPart) {
        this.computerParts = computerPart;
    }

    public Map<String, String> getComputerParts() {
        return computerParts;
    }
}
