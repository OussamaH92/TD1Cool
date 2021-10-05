package Observable;

import Observable.Observable;
import Observateur.*;

/**
 * Represente un capteur de temperature.
 */
public abstract class TemperatureSensor implements Observable
{
	protected String name;
	
	public TemperatureSensor(String name)
	{
		this.name = name;
		this.obs.add(new TemperatureAlarm());
	}

	public abstract float getTemperature();

	public abstract void setTemperature(EvenementObs event);
	
	public void addWeatherStation(WeatherStation ws)
	{
		obs.add(ws);
	}
}
