package pl.sda.java.designPatterns.behavioral.observer;

import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.behavioral.observer.observable.WeatherForecast;
import pl.sda.java.designPatterns.behavioral.observer.observers.InternetNews;
import pl.sda.java.designPatterns.behavioral.observer.observers.RadioNews;
import pl.sda.java.designPatterns.behavioral.observer.observers.TVNews;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void shouldNotifyTVNewsWhenForecastChange() {
        WeatherForecast weatherForecast = new WeatherForecast(24, 1035);

        weatherForecast.registerObserver(new TVNews());
        String notifiedObservers = weatherForecast.updateForecast(33, 1024);

        assertEquals("TVNews", notifiedObservers);
    }

    @Test
    void shouldNotifyTVNewsAndInternetNewsWhenForecastChange() {
        WeatherForecast weatherForecast = new WeatherForecast(24, 1035);

        weatherForecast.registerObserver(new TVNews());
        weatherForecast.registerObserver(new InternetNews());
        String notifiedObservers = weatherForecast.updateForecast(33, 1024);

        assertTrue(notifiedObservers.contains("TVNews"));
        assertTrue(notifiedObservers.contains("InternetNews"));
    }

    @Test
    void shouldNotifyAllObserversWhenForecastChange() {
        WeatherForecast weatherForecast = new WeatherForecast(24, 1035);

        weatherForecast.registerObserver(new TVNews());
        weatherForecast.registerObserver(new InternetNews());
        weatherForecast.registerObserver(new RadioNews());
        String notifiedObservers = weatherForecast.updateForecast(33, 1024);

        assertTrue(notifiedObservers.contains("TVNews"));
        assertTrue(notifiedObservers.contains("InternetNews"));
        assertTrue(notifiedObservers.contains("RadioNews"));

    }
}