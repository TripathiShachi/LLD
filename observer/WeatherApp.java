package org.example1.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherApp {

    List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setWeatherData(String s) {
        // Set weather data
        // Notify observers
        notifyObservers(s);
    }

    public void notifyObservers(String s) {
        for (Observer observer : observers) {
            observer.update(s);
        }
    }

}
