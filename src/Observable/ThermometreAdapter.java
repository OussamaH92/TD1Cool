package Observable;
import Observateur.*;

public class ThermometreAdapter extends TemperatureSensor {

    Thermometer thermometer = new Thermometer(0);

    public ThermometreAdapter(String name) {
        super(name);
    }

    @Override
    public void notifier(){
        EvenementObs temp = new EvenementObs(this.name, thermometer.getTemperature());
        for(Observateur o : obs){
            o.update(temp);
        }
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
