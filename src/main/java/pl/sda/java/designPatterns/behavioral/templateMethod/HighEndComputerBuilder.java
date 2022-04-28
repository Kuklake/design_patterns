package pl.sda.java.designPatterns.behavioral.templateMethod;

public class HighEndComputerBuilder extends ComputerBuilder{

    @Override
    protected void addProcessor() {
        computerParts.put("processor", "super procesor");
    }

    @Override
    protected void setupMotherboard() {
        motherBoardSetupStatus.add("Attaching super motherboard to the case");
        motherBoardSetupStatus.add("plugging in the power");
    }

    @Override
    public void addMotherboard() {
        computerParts.put("motherboard", "super motherboard");
    }
}
