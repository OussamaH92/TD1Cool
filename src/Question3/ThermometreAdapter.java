package Question3;

import Observable.EvenementObs;
import Observable.Thermometer;
import Observateur.Observateur;

public class ThermometreAdapter extends TemperatureSensor {

    Thermometer thermometer = new Thermometer(0);

    public ThermometreAdapter(String name) {
        super(name);
    }

    @Override
    public float getTemperature() {
        return thermometer.getTemperature();
    }

    @Override
    public void setTemperature(EvenementObs event) {
        if(event.isDecrease()){
            thermometer.decreaseTemperature(event.getTemperature());
        }else{
            thermometer.increaseTemperature(event.getTemperature());
        }
    }

}
