package pattern02a_observe_javaway;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement
{
	private double mTemperature;
	private double mHumidity;
	
	private Observable mObservable;

	public CurrentConditionDisplay(Observable weatherData)
	{
		mObservable = weatherData;
		mObservable.addObserver(this);
	}
	
	@Override
	public void display()
	{
		System.out.println("Current conditions: " + mTemperature + "F degrees and " + mHumidity + "% humidity");
		
	}

	/*@Override
	public void update(WeatherUpdateEvent e)
	{
		mTemperature=e.getTeperature();
		mHumidity = e.getHumidity();
		
		display();
		
	}*/

	@Override
	public void update(Observable observable, Object data) {
		if (observable instanceof WeatherData )
		{
			WeatherData weatherData = (WeatherData)observable;
			
			mTemperature = weatherData.getTemperature();
			mHumidity = weatherData.getHumidity();
			display();
		}
		
	}
	
}
