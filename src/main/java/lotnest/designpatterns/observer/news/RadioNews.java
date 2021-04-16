package lotnest.designpatterns.observer.news;

import lotnest.designpatterns.observer.weatherforecast.WeatherForecast;

public class RadioNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println ("[Radio] New weather forecast: temperature - " + weatherForecast.getTemperature () + " degrees, pressure - " + weatherForecast.getPressure () + " hPa");
    }
}
