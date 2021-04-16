package lotnest.designpatterns.observer.news;

import lotnest.designpatterns.observer.weatherforecast.WeatherForecast;

public class InternetNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("[Internet] New weather forecast: temperature - " + weatherForecast.getTemperature() + " degrees, pressure - " + weatherForecast.getPressure() + " hPa");
    }
}
