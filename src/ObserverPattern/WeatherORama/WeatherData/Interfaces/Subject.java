package ObserverPattern.WeatherORama.WeatherData.Interfaces;

import ObserverPattern.WeatherORama.Displays.Interfaces.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
