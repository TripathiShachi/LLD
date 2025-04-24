package org.example1.observer;

public class observerMain {

    public static void main(String[] args) {
        System.out.println("Observer Pattern Example");
        WeatherApp weatherApp = new WeatherApp();
        MobileDevice mobileDevice = new MobileDevice();
        weatherApp.registerObserver(mobileDevice);
        weatherApp.setWeatherData("Sunny");
        weatherApp.setWeatherData("Rainy");
    }

}
