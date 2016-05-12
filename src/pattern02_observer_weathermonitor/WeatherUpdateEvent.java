package pattern02_observer_weathermonitor;

import java.util.EventObject;

public class WeatherUpdateEvent extends EventObject
{
	private double mTeperature;
	private double mPressure;
	private double mHumidity;
	
	public WeatherUpdateEvent(Object source)
	{
		super(source);
		
	}

	public WeatherUpdateEvent(Object source, double teperature, double pressure,
			double humidity)
	{
		super(source);
		mTeperature = teperature;
		mPressure = pressure;
		mHumidity = humidity;
	}

	public double getTeperature()
	{
		return mTeperature;
	}

	public double getPressure()
	{
		return mPressure;
	}

	public double getHumidity()
	{
		return mHumidity;
	}

	public void setTeperature(double teperature)
	{
		mTeperature = teperature;
	}

	public void setPressure(double pressure)
	{
		mPressure = pressure;
	}

	public void setHumidity(double humidity)
	{
		mHumidity = humidity;
	}
	
	
	
	
	
	

}
