package pattern02a_observe_javaway;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{

	private Observable mObservable;
	private double mCurrentPressure = 29.92;
	private double mLastPressure;
	private String mMessage;
	
	public ForecastDisplay(Observable observable)
	{
		mObservable = observable;
		mObservable.addObserver(this);
	}
	
	@Override
	public void display() {

		setMessage();
		System.out.println(mMessage);
		
	}

	@Override
	public void update(Observable obs, Object pArg) 
	{
		if (obs instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData)obs;
			
			mLastPressure = mCurrentPressure;
			mCurrentPressure = weatherData.getPressure();
			
			display();
		}
		
	}
	
	private void setMessage()
	{
		if (mCurrentPressure > mLastPressure)
			mMessage = "Improving weather on the way!";
		else if (mCurrentPressure < mLastPressure)
			mMessage = "Watch out for cooler, rainy weather";
		else
			mMessage = "More of the same.";
	}
	
	

}
