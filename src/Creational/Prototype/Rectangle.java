package Creational.Prototype;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    public Rectangle(int x, int y, String color, Double length, Double width) {
        super(x, y, color);
        this.length = length;
        this.width = width;
    }

    public Shape clone() {
        return new Rectangle(this);
    }

    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public Double getLength() {
        return this.length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
