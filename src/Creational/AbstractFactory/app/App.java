package Creational.AbstractFactory.app;

import Creational.AbstractFactory.buttons.Button;
import Creational.AbstractFactory.checkboxes.Checkbox;
import Creational.AbstractFactory.factories.GUIFactory;

// The client code works with factories and products only
// through abstract types: GUIFactory, Button and Checkbox. This
// lets you pass any factory or product subclass to the client
// code without breaking it.
public class App {
    // If your program doesn’t operate with product families,
    // then you don’t need an abstract factory.
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }

}
