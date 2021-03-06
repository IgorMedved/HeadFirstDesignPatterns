package pattern02_observer_weathermonitor;

public class App
{

	public static void main(String[] args)
	{
		System.out.println("Start");
		WeatherData data = new WeatherData();
		CurrentConditionDisplay display = new CurrentConditionDisplay(data);
		StatisticsDisplay display2 = new StatisticsDisplay(data);
		HeatIndexDisplay display3 = new HeatIndexDisplay(data);
		
		data.setMeasurements(80, 30.4, 65);
		data.setMeasurements(82, 29.2, 70);
		data.setMeasurements(78, 29.2, 90);

	}

}
