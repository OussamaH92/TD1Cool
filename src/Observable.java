import java.util.ArrayList;

public interface Observable {

    public ArrayList<Observateur> obs = new ArrayList<>();

    public void notifier();

}
