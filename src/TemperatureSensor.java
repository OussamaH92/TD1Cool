import java.util.ArrayList;

/**
 * Represente un capteur de temperature.
 */
public class TemperatureSensor implements Observable
{
	private String name;
	private float temperature;
	
	public TemperatureSensor(String name)
	{
		this.name = name;
		this.obs.add(new TemperatureAlarm());
	}
	
	public float getTemperature()
	{
		return temperature;
	}
	
	public void setTemperature(float temperature)
	{
		this.temperature = temperature;
		notifier();
	}

	@Override
	public void notifier(){
		for(Observateur o : obs){
			o.update(this.name,this.getTemperature());
		}
	}
	
	public void addWeatherStation(WeatherStation ws)
	{
		obs.add(ws);
	}
}