package pl.sda.java.designPatterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    private static int objectsCount;

    public static int getObjectsCount() {
        return objectsCount;
    }

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
        objectsCount++;
    }

    private void heavyInitialConfiguration() {
        System.out.println("loading very heavy initial configuration");
    }

    @Override
    public String process() {
        return "processing completed";
    }

    protected static void resetObjectCount() {
        objectsCount = 0;
    }
}
