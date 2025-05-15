public class Main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        currentDisplay cd = new currentDisplay(wd);
        ForecastDisplay fd = new ForecastDisplay(wd);
        StatisticDisplay sd = new StatisticDisplay(wd);
        wd.setMeasurements(80,65 ,30.4f);
        //wd.setMeasurements(50.5f,20 ,70.4f);
        //wd.setMeasurements(100,45.2f ,22);
        wd.removeObserver(fd);
        System.out.println("After removing");
        wd.setMeasurements(47.1f,22.4f,40.9f);
    }
    
}
