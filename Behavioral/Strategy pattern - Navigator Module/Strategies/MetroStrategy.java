package Strategies;


/**
 * @author DINESH KUMAR
 */

public class MetroStrategy implements RouteStrategies{

    public void computeRoute(String start, String end){
        System.out.println("Route from " + start + " to " + end + " by Public Transport");
    }
}
