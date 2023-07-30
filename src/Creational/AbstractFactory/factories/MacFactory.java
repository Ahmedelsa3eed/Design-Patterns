package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.buttons.Button;
import Creational.AbstractFactory.buttons.MacButton;
import Creational.AbstractFactory.checkboxes.Checkbox;
import Creational.AbstractFactory.checkboxes.MacCheckbox;

// Concrete factories produce a family of products that belong
// to a single variant. The factory guarantees that the
// resulting products are compatible. Signatures of the concrete
// factory's methods return an abstract product, while inside
// the method a concrete product is instantiated.
public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        // TODO Auto-generated method stub
        return new MacCheckbox();
    }
    
}
