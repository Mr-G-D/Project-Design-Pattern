import Strategies.CarStrategy;
import Strategies.MetroStrategy;
import Strategies.WalkStrategy;

/**
 * @author DINESH KUMAR
 */

public class NavigatorModule {



    public static void main(String[] str){
        String start = "New York";
        String end = "Montreal";

        Navigator nav = new Navigator();

        nav.setStrategy(new CarStrategy());
        nav.route(start, end);

        nav.setStrategy(new MetroStrategy());
        nav.route(start, end);

        nav.setStrategy(new WalkStrategy());
        nav.route(start, end);
    }
}
