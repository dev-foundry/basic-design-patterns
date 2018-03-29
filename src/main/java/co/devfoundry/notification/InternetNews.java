package co.devfoundry.notification;

import co.devfoundry.weather_forecast.WeatherForecast;

public class InternetNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }

}
