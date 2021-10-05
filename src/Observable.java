import java.util.ArrayList;

public interface Observable {

    public ArrayList<Observateur> obs = new ArrayList<>();

     void notifier();

}
