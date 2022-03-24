package pl.sda.java.designPatterns.creational.singleton;

/**
 *  założenie: istnieje tylko jeden obiekt tej klasy
 */

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
