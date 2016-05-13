package pattern02a_observe_javaway;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

import pattern02_observer_weathermonitor.WeatherConditionObserver;
import pattern02_observer_weathermonitor.WeatherUpdateEvent;

public class WeatherData extends Observable
{
	
	private double mTemperature;
	private double mPressure;
	private double mHumidity;
	


	public void setMeasurements(double temperature, double pressure, double humidity)
	{
		mTemperature= temperature;
		mPressure= pressure;
		mHumidity= humidity;
		
		measurementsChanged();
	}
	
	public void measurementsChanged()
	{
		setChanged();
		notifyObservers();
	}







	public double getTemperature() {
		return mTemperature;
	}







	public double getPressure() {
		return mPressure;
	}







	public double getHumidity() {
		return mHumidity;
	}
}
