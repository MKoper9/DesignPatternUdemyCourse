package observerHomework.notification;

import observerHomework.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
