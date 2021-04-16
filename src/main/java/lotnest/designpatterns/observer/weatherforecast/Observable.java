package lotnest.designpatterns.observer.weatherforecast;

import lotnest.designpatterns.observer.news.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
