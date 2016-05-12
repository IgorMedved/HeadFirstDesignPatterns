package pattern02_observer_weathermonitor;

public class StatisticsDisplay implements DisplayElement, WeatherConditionObserver
{
	private double mMaxTemp;
	private double mMinTemp;
	private double mAverageTemp;
	
	int mCounter;
	
	private Subject mWeatherData;
	
	
	public StatisticsDisplay(Subject weatherData)
	{
		mWeatherData = weatherData;
		weatherData.registerObserver(this);
	}
	

	
	@Override
	public void update(WeatherUpdateEvent e)
	{
		mCounter ++;
		double currentTemp = e.getTeperature();
		if (mCounter ==1)
		{
			mMaxTemp = currentTemp;
			mMinTemp = currentTemp;
			mAverageTemp = currentTemp;
		}
		else
		{
			if (mMaxTemp < currentTemp)
				mMaxTemp = currentTemp;
			else if (mMinTemp > currentTemp)
				mMinTemp = currentTemp;
			
			
		}
		mAverageTemp = mAverageTemp * (mCounter -1)/ mCounter + currentTemp/mCounter;
		
			
		display();
		
	}

	@Override
	public void display()
	{
		System.out.println("Avg/Max/Min temperature = " + mAverageTemp + "/"+mMaxTemp + "/"+mMinTemp );
		
	}

}
