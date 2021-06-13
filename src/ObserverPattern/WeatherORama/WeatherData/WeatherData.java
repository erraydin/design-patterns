package ObserverPattern.WeatherORama.WeatherData;

import ObserverPattern.WeatherORama.Displays.Interfaces.Observer;
import ObserverPattern.WeatherORama.WeatherData.Interfaces.Subject;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class WeatherData implements Subject {
    //using arraylist will be efficient enough if there arent many observers
    private final ArrayList<Observer> observers;
    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);
        if (idx != -1) {observers.remove(idx);}
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void getMeasurements() {
        temp = getTemperature();
        humidity = getHumidity();
        pressure = getPressure();
        notifyObservers();
    }


    private double getTemperature() {
        int randomInt= ThreadLocalRandom.current().nextInt(0, 351);
        return (double) randomInt / 10;
    }

    private double getHumidity() {
        int randomInt = ThreadLocalRandom.current().nextInt(0, 1001);
        return (double) randomInt / 10;
    }

    private double getPressure() {
        int randomInt = ThreadLocalRandom.current().nextInt(0, 1001);
        return (double) randomInt / 10;
    }


}
