package pl.sda.java.designPatterns.behavioral.observer.observable;

import pl.sda.java.designPatterns.behavioral.observer.observers.WeatherObserver;

import java.util.*;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    Set<WeatherObserver> observers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public String updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        return notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String notifyObservers() {

        List<String> notifiedObservers = new ArrayList<>();
        for (WeatherObserver observer : observers) {
            observer.updateForecast(this);
            notifiedObservers.add(observer.getClass().getSimpleName());
        }
        return String.join(",", notifiedObservers);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }
}
