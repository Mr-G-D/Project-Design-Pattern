package ConcreteProducts;

import AbstractProducts.Button;

/**
 * @author DINESH KUMAR
 */

public class WindowsButton implements Button {

    public void click(){
        System.out.println("Windows Button");
    }
}
