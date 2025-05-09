/**
 * @author DINESH KUMAR
 */

public class LoggerModule {

    public static void main(String[] str){
        UserA userA = new UserA();

        UserB userB = new UserB();

        userA.write("This is from " + userA.toString());
        userB.write("This is from " + userB.toString());

        Logger logger = Logger.getLogger();

        logger.close();
    }
}
