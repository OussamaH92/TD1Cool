/**
 * Represente une station meteo
 */
public class WeatherStation implements Observateur
{
	private static int stationCounter = 0;
	private int number;
	
	public WeatherStation()
	{
		stationCounter++;
		number = stationCounter;
	}
	
	public void displayTemperature(String sensorName, float temperature)
	{
		System.out.println("Station " + number + " - " + sensorName + " " + temperature + "�");
	}

	@Override
	public void update(EvenementObs event){
		this.displayTemperature(event.getSensorName(), event.getTemperature());
	}
}
