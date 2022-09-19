package shapes;

/**
 * 1. What is the difference between `super` and `this`
 * 2. What about `super(...)` and `this(...)`
 * 3. What are static fields and methods
 */

public class Shape {
    public String color;

    public Shape(String color) {
        System.out.println("Inside Shape constructor");
        this.color = color;
    }
}
