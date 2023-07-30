package Creational.FactoryMethod.Pizza;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        System.out.println("prepare cheese pizza...");
    }

    @Override
    public void bake() {
        // TODO Auto-generated method stub
        System.out.println("baking cheese pizza...");
    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub
        System.out.println("cutting cheese pizza...");
    }

    @Override
    public void box() {
        // TODO Auto-generated method stub
        System.out.println("boxing cheese pizza...");
    }

}