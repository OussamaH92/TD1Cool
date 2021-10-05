public class EvenementObs {

    private String SensorName;
    private float temperature;

    public EvenementObs(String sensorName, float temperature) {
        SensorName = sensorName;
        this.temperature = temperature;
    }

    public String getSensorName() {
        return SensorName;
    }

    public float getTemperature() {
        return temperature;
    }
}
