package Creational.FactoryMethod.Pizza;

// Base creator (factory method): to force all subclasses 
// to implement their own versions of the method. 
public abstract class PizzaStore {
    
    public final Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Pizza createPizza();

}
