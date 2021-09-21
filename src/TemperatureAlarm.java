public class TemperatureAlarm implements Observateur {

    @Override
    public void update(String sensorName, float temperature){
        if (temperature > 18 || temperature < 4) {
            this.displayAlert(sensorName,temperature);
        }
    }

    private void displayAlert(String sensorName, float temperature){
        System.out.println(sensorName + " temperature : " + temperature);
    }

}
