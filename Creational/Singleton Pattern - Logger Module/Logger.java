/**
* @author DINESH KUMAR
*/

import java.io.FileWriter;
import java.io.PrintWriter;

public class Logger {

    private static Logger instance;
    private PrintWriter writter;
    private static final Object lock = new Object();

    private Logger(){
        try{
            writter = new PrintWriter(new FileWriter("app.log", true), true);
        }catch (Exception err){
            System.out.println(err);
        }
    }

    public static Logger getLogger(){
        if(instance == null){
            synchronized (lock){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        writter.println(message);
    }

    public void close() {
        writter.close();
    }
}
