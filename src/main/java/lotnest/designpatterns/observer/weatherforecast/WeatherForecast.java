package lotnest.designpatterns.observer.weatherforecast;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotnest.designpatterns.observer.news.Observer;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private final Set<Observer> registeredObservers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(registeredObserver -> registeredObserver.updateForecast(this));
    }

    public void updateForecast(int temperature, int pressure) {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}
