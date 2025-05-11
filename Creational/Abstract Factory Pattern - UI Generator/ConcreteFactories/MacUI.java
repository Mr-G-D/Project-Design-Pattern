package ConcreteFactories;

import AbstractFactory.UIFactory;
import AbstractProducts.Button;
import AbstractProducts.CheckBox;
import ConcreteProducts.MacButton;
import ConcreteProducts.MacCheckbox;

/**
 * @author DINESH KUMAR
 */

public class MacUI implements UIFactory {

    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckbox();
    }
}
