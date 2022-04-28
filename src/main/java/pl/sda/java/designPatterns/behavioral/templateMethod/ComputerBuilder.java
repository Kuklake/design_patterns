package pl.sda.java.designPatterns.behavioral.templateMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherBoardSetupStatus = new ArrayList<>();

//    template method
    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    protected abstract void addProcessor();

    protected abstract void setupMotherboard();

    public abstract void addMotherboard();

    public List<String> getMotherBoardSetupStatus() {
        return motherBoardSetupStatus;
    }
}
