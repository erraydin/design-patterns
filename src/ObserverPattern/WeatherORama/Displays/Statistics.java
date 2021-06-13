package ObserverPattern.WeatherORama.Displays;

import ObserverPattern.WeatherORama.Displays.Interfaces.Display;
import ObserverPattern.WeatherORama.Displays.Interfaces.Observer;
import ObserverPattern.WeatherORama.WeatherData.Interfaces.Subject;

public class Statistics implements Display, Observer {
    private int numberOfData;
    private double avgTemp;
    private double avgHumidity;
    private double avgPressure;
    private final Subject weatherData;

    public Statistics(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        avgTemp = newAverage(avgTemp, temp);
        avgHumidity= newAverage(avgHumidity, humidity);
        avgPressure = newAverage(avgPressure, pressure);
        numberOfData++;
        display();
    }

    private double newAverage(double oldAverage, double newData) {
        return (oldAverage * numberOfData + newData) / (numberOfData + 1);
    }

    @Override
    public void display() {
        System.out.println("Statistics");
        System.out.println("Average Temperature: " + avgTemp);
        System.out.println("Average Humidity: " + avgHumidity);
        System.out.println("Average Pressure: " + avgPressure);
    }
}
