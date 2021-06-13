package ObserverPattern.WeatherORama.Test;

import ObserverPattern.WeatherORama.Displays.CurrentConditions;
import ObserverPattern.WeatherORama.Displays.Statistics;
import ObserverPattern.WeatherORama.WeatherData.WeatherData;

public class WeatherORamaTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        Statistics statistics = new Statistics(weatherData);

        weatherData.getMeasurements();
        System.out.println("");

        weatherData.getMeasurements();
        System.out.println("");

        weatherData.getMeasurements();
        System.out.println("");

    }
}
