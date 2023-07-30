package Creational.FactoryMethod.Pizza;

public class Demo {
    private static PizzaStore pizzaStore;

    public static void main(String[] args) {
        configure("cheese");
        runBusinessLogic();
    }

    static void configure(String pizzaType) {
        if (pizzaType.equals("cheese")) {
            pizzaStore = new CheesePizzaFactory();
        }
        else {
            pizzaStore = new GreekPizzaFactory();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        pizzaStore.orderPizza();
    }

}