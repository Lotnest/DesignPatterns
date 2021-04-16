package lotnest.designpatterns.observer.news;

import lotnest.designpatterns.observer.weatherforecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
