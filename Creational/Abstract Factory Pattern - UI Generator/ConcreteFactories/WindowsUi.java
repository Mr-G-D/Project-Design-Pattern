package ConcreteFactories;

import AbstractFactory.UIFactory;
import AbstractProducts.Button;
import AbstractProducts.CheckBox;
import ConcreteProducts.WindowsButton;
import ConcreteProducts.WindowsCheckbox;

/**
 * @author DINESH KUMAR
 */

public class WindowsUi implements UIFactory {

    public Button createButton(){
        return new WindowsButton();
    }

    public CheckBox createCheckBox(){
        return new WindowsCheckbox();
    }
}
