public class StatisticDisplay implements Observer, DisplayElement{
    subject WeatherData;//bcoz if currentDisplay want to register it will call regobserver () of weatherdata.
    private float temp;
    private float humidity;
    private float pressure;

    public StatisticDisplay(subject WeatherData){
        this.WeatherData=WeatherData;
        WeatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    public void display(){
    System.out.println("Statistic Display");
    System.out.println("Temperature : "+temp+" Humidity : "+humidity+" Pressure : "+pressure);
    }
}