package pattern02_observer_weathermonitor;

public interface Subject
{
	public void registerObserver(WeatherConditionObserver o);
	public void removeObserver(WeatherConditionObserver o);
	public void notifyObservers();

}
