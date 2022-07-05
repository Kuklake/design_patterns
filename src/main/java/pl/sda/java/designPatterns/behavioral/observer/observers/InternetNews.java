package pl.sda.java.designPatterns.behavioral.observer.observers;

import pl.sda.java.designPatterns.behavioral.observer.observable.WeatherForecast;

public class InternetNews implements WeatherObserver {
    @Override
    public String updateForecast(WeatherForecast weatherForecast) {
        return "Internet - nowa prognoza pogody: temp. " + weatherForecast.getTemperature()
                + " ciśnienie: " + weatherForecast.getPressure();
    }
}
