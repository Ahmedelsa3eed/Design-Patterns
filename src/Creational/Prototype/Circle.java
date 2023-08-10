package Creational.Prototype;

public class Circle extends Shape {
    private Double radius;

    public Circle(Circle circle) {
        // A parent constructor call is needed to copy private
        // fields defined in the parent class.
        super(circle);
        this.radius = circle.radius;
    }

    public Circle(int x, int y, String color, Double radius) {
        super(x, y, color);
        this.radius = radius;
    }
    
    public Shape clone() {
        return new Circle(this);
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
