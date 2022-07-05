package pl.sda.java.designPatterns.behavioral.observer.observers;

import pl.sda.java.designPatterns.behavioral.observer.observable.WeatherForecast;

public class TVNews implements WeatherObserver {
    @Override
    public String updateForecast(WeatherForecast weatherForecast) {
        return "TV - nowa prognoza pogody: temp. " + weatherForecast.getTemperature()
                + " ciśnienie: " + weatherForecast.getPressure();
    }
}
