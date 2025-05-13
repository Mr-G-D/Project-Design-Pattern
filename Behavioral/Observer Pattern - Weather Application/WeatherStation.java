import java.util.ArrayList;
import java.util.List;

/**
 * @author DINESH KUMAR
 */

public class WeatherStation implements Subject{

    int temp;

    List<Observer> obs = new ArrayList<>();

    @Override
    public void addObserver(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : obs){
            ob.update(temp);
        }
    }

    public void setTemp(int temp){
        this.temp = temp;
        System.out.println("Change in temperature");
        notifyObserver();
    }
}
