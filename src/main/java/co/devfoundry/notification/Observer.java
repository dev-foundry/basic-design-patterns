package co.devfoundry.notification;

import co.devfoundry.weather_forecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
