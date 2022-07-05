package pl.sda.java.designPatterns.behavioral.observer.observable;

import pl.sda.java.designPatterns.behavioral.observer.observers.WeatherObserver;

public interface Observable {

    void registerObserver(WeatherObserver observer);
    void unRegisterObserver(WeatherObserver observer);
    String notifyObservers();

}
