/**
 * @author DINESH KUMAR
 */

public class WindowDisplay implements Observer{

    @Override
    public void update(int temp) {
        System.out.println("[Window Display] the current temperature is " + temp+ "'C");
    }
}
