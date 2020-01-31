package observerHomework.notification;

import observerHomework.WeatherForecast;
import observerHomework.notification.Observer;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: "
                +weatherForecast.getTemperature()
                +" stopni, ciśnienie: "+weatherForecast.getPressure()+"hPa");
    }
}
