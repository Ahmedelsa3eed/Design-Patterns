package Creational.FactoryMethod.Pizza;

public class CheesePizzaFactory extends PizzaStore {

    public Pizza createPizza() {
        return new CheesePizza();
    }
}
