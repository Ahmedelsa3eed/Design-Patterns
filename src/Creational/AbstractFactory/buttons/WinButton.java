package Creational.AbstractFactory.buttons;

// Concrete products are created by corresponding concrete
// factories.
public class WinButton implements Button {

    @Override
    public void paint() { // Render a button in Windows style.
        // TODO Auto-generated method stub
        System.out.println("You create WindowsButton.");
    }
    
}
