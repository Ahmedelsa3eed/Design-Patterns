package Creational.FactoryMethod.Pizza;

// GreekPizzaFactory will produce greek pizza
public class GreekPizzaFactory extends PizzaStore {
    public Pizza createPizza() {
        return new GreekPizza();
    }
}
