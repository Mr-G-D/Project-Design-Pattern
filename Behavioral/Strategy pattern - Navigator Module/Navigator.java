import Strategies.RouteStrategies;

/**
 * @author DINESH KUMAR
 */

public class Navigator {

    RouteStrategies strategy;

    public void setStrategy(RouteStrategies strategy){
        this.strategy = strategy;
    }

    public void route(String start, String end){
        if(strategy == null){
            System.out.println("Cannot find Route without type of Transport");
        }else{
            strategy.computeRoute(start, end);
        }
    }
}
