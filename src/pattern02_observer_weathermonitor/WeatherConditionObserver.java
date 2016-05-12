package pattern02_observer_weathermonitor;

public interface WeatherConditionObserver
{
	public void update (WeatherUpdateEvent e);
}
