package observerHomework;

import observerHomework.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void unregisterObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void setRegisteredObservers(Set<Observer> registeredObservers) {
        this.registeredObservers = registeredObservers;
    }
}
