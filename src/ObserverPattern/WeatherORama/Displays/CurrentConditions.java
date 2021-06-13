package ObserverPattern.WeatherORama.Displays;

import ObserverPattern.WeatherORama.Displays.Interfaces.Display;
import ObserverPattern.WeatherORama.Displays.Interfaces.Observer;
import ObserverPattern.WeatherORama.WeatherData.Interfaces.Subject;

public class CurrentConditions implements Display, Observer {
    private double temp;
    private double humidity;
    private double pressure;
    private final Subject weatherData;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions");
        System.out.println("Temperature: " + temp);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
        System.out.println("");
    }
}
