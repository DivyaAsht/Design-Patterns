import java.util.ArrayList;

public class WeatherData implements subject {
    ArrayList<Observer> list = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer o){
        list.add(o);
    }

    public void removeObserver(Observer o){
            list.remove(o);
        }

    public void notifyObserver(){
        for(Observer o : list){
            o.update(temp,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemp(){
        return temp;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}