package Creational.AbstractFactory;

import Creational.AbstractFactory.app.App;
import Creational.AbstractFactory.factories.GUIFactory;
import Creational.AbstractFactory.factories.MacFactory;
import Creational.AbstractFactory.factories.WinFactory;

/* Use the Abstract Factory when your code needs
    to work with various families of related products,
    but you don’t want it to depend on the concrete classes
    of those products—they might be unknown beforehand or
    you simply want to allow for future extensibility. */
public class Demo {

    private static App configureApplication() {
        GUIFactory guiFactory;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.equals("windows 11")) {
            guiFactory = new WinFactory();
        } else {
            guiFactory = new MacFactory();
        }

        App app = new App(guiFactory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
