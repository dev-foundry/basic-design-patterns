package co.devfoundry.notification;

import co.devfoundry.weather_forecast.WeatherForecast;

public class TvNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }

}
