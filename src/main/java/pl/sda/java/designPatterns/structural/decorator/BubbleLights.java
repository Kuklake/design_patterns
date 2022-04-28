package pl.sda.java.designPatterns.structural.decorator;

public class BubbleLights extends TreeDecorator{

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addBubbleLightsDecoration();
    }

    private String addBubbleLightsDecoration() {
        return " with bubble lights";
    }
}
