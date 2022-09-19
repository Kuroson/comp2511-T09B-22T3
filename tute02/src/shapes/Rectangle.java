package shapes;

/**
 * 1. What is the difference between `super` and `this`
 * 2. What about `super(...)` and `this(...)`
 * 3. What are static fields and methods
 */

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color); // => Calling constructor of parent `Shape(String color)`
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String name, int width, int height) {
        this(name); // => Calling constructor `Rectangle(String color)`
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        // Rectangle(3 arguments) => Rectangle(1 argument) => Shape(1 argument)
        Rectangle r = new Rectangle("red", 10, 20);
        System.out.println(r.color);
        System.out.println(r.width);
        System.out.println(r.height);
    }
}
