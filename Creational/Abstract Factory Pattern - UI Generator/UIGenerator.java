import AbstractFactory.UIFactory;
import ConcreteFactories.MacUI;
import ConcreteFactories.WindowsUi;

/**
 * @author DINESH KUMAR
 */

public class UIGenerator {
    public static void main(String[] str){

        //Mac UI

        UIFactory factory = new MacUI();
        factory.createButton().click();
        factory.createCheckBox().check();

        // Windows UI

        factory = new WindowsUi();
        factory.createButton().click();
        factory.createCheckBox().check();
    }
}
