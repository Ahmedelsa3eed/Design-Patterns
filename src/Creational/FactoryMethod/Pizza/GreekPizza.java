package Creational.FactoryMethod.Pizza;

public class GreekPizza implements Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        System.out.println("prepare greek pizza...");
    }

    @Override
    public void bake() {
        // TODO Auto-generated method stub
        System.out.println("baking greek pizza...");
    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub
        System.out.println("cutting greek pizza...");
    }

    @Override
    public void box() {
        // TODO Auto-generated method stub
        System.out.println("boxing greek pizza...");
    }
    
}
