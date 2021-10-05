package Observable;
import Observateur.*;


public class DefaultTemperatureSensor extends TemperatureSensor {

    private float temperature;

    public DefaultTemperatureSensor(String nom) {
        super(nom);
    }

    @Override
    public void notifier(){
        EvenementObs temp = new EvenementObs(this.name, this.temperature);
        for(Observateur o : obs){
            o.update(temp);
        }
    }

    @Override
    public float getTemperature() {
        return this.temperature;
    }

    @Override
    public void setTemperature(EvenementObs event) {
        this.temperature = event.getTemperature();
    }
}
