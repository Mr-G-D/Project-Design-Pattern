package AbstractFactory;

import AbstractProducts.Button;
import AbstractProducts.CheckBox;

/**
 * @author DINESH KUMAR
 */

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
