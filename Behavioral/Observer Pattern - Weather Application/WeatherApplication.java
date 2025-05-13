/**
 * @author DINESH KUMAR
 */

public class WeatherApplication {

    public static void main(String[] str){
        WeatherStation station = new WeatherStation();

        Observer user1 = new PhoneDisplay();
        Observer user2 = new WindowDisplay();

        station.addObserver(user1);
        station.addObserver(user2);

        station.setTemp(10);

        station.removeObserver(user1);

        station.setTemp(15);
    }
}
