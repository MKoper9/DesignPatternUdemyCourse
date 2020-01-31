package observerHomework.medium;

import observerHomework.WeatherForecast;
import observerHomework.notification.Observer;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("nowa prognoza pogody: temperatura: "
                +weatherForecast.getTemperature()
                +" stopni, ciśnienie: "+weatherForecast.getPressure()+"hPa");
    }
}
