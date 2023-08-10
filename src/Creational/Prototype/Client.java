package Creational.Prototype;

public class Client {

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        Circle circle = new Circle(0, 0, "red", 10.0);
        Rectangle rectangle = new Rectangle(20, 30, "green", 10.0, 10.0);

        shapeManager.addShape("circle", circle);
        shapeManager.addShape("rectangle", rectangle);

        Shape clonedCircle = shapeManager.getShape("circle");
        Shape clonedRectangle = shapeManager.getShape("rectangle");

        clonedCircle.draw();
        clonedRectangle.draw();
    }
}
