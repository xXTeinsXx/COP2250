// Triangle_BC.java
public class Triangle_BC extends GeometricObject {
    // Three double data fields with default values 1.0
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    // No-arg constructor that creates a default triangle
    public Triangle_BC() {
    }
    
    // Constructor with specified sides
    public Triangle_BC(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // Accessor methods for all three sides
    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public double getSide3() {
        return side3;
    }
    
    // Method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    // Method for area (returns 0 as specified)
    public double getArea() {
        return 0;
    }
    
    // String description of the triangle
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}