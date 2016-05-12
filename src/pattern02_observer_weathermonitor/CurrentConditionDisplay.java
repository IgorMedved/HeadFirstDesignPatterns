package pattern02_observer_weathermonitor;

public class CurrentConditionDisplay implements WeatherConditionObserver, DisplayElement
{
	private double mTemperature;
	private double mHumidity;
	
	private Subject mWeatherData;

	public CurrentConditionDisplay(Subject weatherData)
	{
		mWeatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		System.out.println("Current conditions: " + mTemperature + "F degrees and " + mHumidity + "% humidity");
		
	}

	@Override
	public void update(WeatherUpdateEvent e)
	{
		mTemperature=e.getTeperature();
		mHumidity = e.getHumidity();
		
		display();
		
	}
	
}
