package ObserverPattern.WeatherORama.Displays.Interfaces;

public interface Observer {
    void update(double temp, double humidity, double pressure);
}
