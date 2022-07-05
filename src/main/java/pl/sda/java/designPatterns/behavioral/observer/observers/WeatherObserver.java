package pl.sda.java.designPatterns.behavioral.observer.observers;

import pl.sda.java.designPatterns.behavioral.observer.observable.WeatherForecast;

public interface WeatherObserver {
    String updateForecast(WeatherForecast weatherForecast);
}
