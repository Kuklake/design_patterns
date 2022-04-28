package pl.sda.java.designPatterns.behavioral.templateMethod;

public class StandardComputerBuilder extends ComputerBuilder {

    @Override
    protected void addProcessor() {
        computerParts.put("processor", "standard procesorr");
    }

    @Override
    protected void setupMotherboard() {
        motherBoardSetupStatus.add("Attaching standard motherboard to the case");
        motherBoardSetupStatus.add("plugging in the power");
    }

    @Override
    public void addMotherboard() {
        computerParts.put("motherboard", "standard motherboard");
    }
}
