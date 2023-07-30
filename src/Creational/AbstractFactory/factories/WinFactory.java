package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.buttons.Button;
import Creational.AbstractFactory.buttons.WinButton;
import Creational.AbstractFactory.checkboxes.Checkbox;
import Creational.AbstractFactory.checkboxes.WinCheckbox;

// Each concrete factory has a corresponding product variant.
public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        // TODO Auto-generated method stub
        return new WinCheckbox();
    }
    
}
