package pattern02_observer_weathermonitor;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject
{
	private List<WeatherConditionObserver> observers;
	private double mTemperature;
	private double mPressure;
	private double mHumidity;
	

	WeatherData()
	{
		observers = new LinkedList<>();
	}
	
	
	@Override
	public void registerObserver(WeatherConditionObserver o)
	{
		if (!observers.contains(o))
			observers.add(o);
		
	}

	@Override
	public void removeObserver(WeatherConditionObserver o)
	{
		int i = observers.indexOf(o);
		if (i >=0)
			observers.remove(i);
		
	}

	@Override
	public void notifyObservers()
	{
		if(observers.size()!= 0)
		{
		
			WeatherUpdateEvent ev = new WeatherUpdateEvent(this, mTemperature, mPressure, mHumidity);
			for (WeatherConditionObserver observer: observers)
			{
				observer.update(ev);
			}
		}
		
	}

	public void setMeasurements(double temperature, double pressure, double humidity)
	{
		mTemperature= temperature;
		mPressure= pressure;
		mHumidity= humidity;
		
		measurementsChanged();
	}
	
	public void measurementsChanged()
	{
		notifyObservers();
	}
}
