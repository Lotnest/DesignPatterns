package lotnest.designpatterns.observer;

import lotnest.designpatterns.observer.news.InternetNews;
import lotnest.designpatterns.observer.news.RadioNews;
import lotnest.designpatterns.observer.news.TvNews;
import lotnest.designpatterns.observer.weatherforecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println ("\nNew forecast - notification only for the website:");
        weatherForecast.updateForecast(18, 1007);
    }
}
