package Question3;

import Observable.Observable;
import Observable.EvenementObs;
import Observateur.Observateur;
import Observateur.TemperatureAlarm;
import Observateur.WeatherStation;

/**
 * Represente un capteur de temperature.
 */
public abstract class TemperatureSensor implements Observable
{
	protected String name;
	protected float temperature;
	
	public TemperatureSensor(String name)
	{
		this.name = name;
		this.obs.add(new TemperatureAlarm());
	}

	@Override
	public void notifier(){
		EvenementObs temp = new EvenementObs(this.name, this.temperature);
		for(Observateur o : obs){
			o.update(temp);
		}
	}

	public abstract float getTemperature();

	public abstract void setTemperature(EvenementObs event);
	
	public void addWeatherStation(WeatherStation ws)
	{
		obs.add(ws);
	}
}
