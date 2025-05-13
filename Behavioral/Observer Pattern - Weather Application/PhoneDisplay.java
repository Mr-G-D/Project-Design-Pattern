/**
 * @author DINESH KUMAR
 */

public class PhoneDisplay implements Observer{

    @Override
    public void update(int temp) {
        System.out.println("[Phone Display] The current temperature is " + temp + "'C");
    }
}
