package Observable;
import Observateur.Observateur;

import java.util.ArrayList;


public interface Observable {

     ArrayList<Observateur> obs = new ArrayList<>();

     void notifier();

}
