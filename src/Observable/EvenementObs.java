package Observable;

public class EvenementObs {

    private String SensorName;
    private float temperature;
    private boolean decrease = false;
    private boolean increase = false;


    public EvenementObs(String sensorName, float temperature) {
        SensorName = sensorName;
        this.temperature = temperature;
    }

    public void setDecrease() {
        this.decrease = true;
    }

    public void setIncrease() {
        this.increase = true;
    }

    public boolean isDecrease() {
        return decrease;
    }

    public boolean isIncrease() {
        return increase;
    }

    public String getSensorName() {
        return SensorName;
    }

    public float getTemperature() {
        return temperature;
    }
}
