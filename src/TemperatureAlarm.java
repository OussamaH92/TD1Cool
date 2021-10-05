public class TemperatureAlarm implements Observateur {


    @Override
    public void update(EvenementObs event){
        if (event.getTemperature() > 18 || event.getTemperature() < 4) {
            displayAlert(event.getSensorName(), event.getTemperature());
        }
    }

    private void displayAlert(String sensorName, float temperature){
        System.out.println(sensorName + " temperature : " + temperature);
    }

}
