// BryanCaban_11_1.java
import java.util.Scanner;

public class BryanCaban_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three sides of the triangle
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        // Create a Triangle object with these sides
        Triangle_BC triangle = new Triangle_BC(side1, side2, side3);
        
        // Prompt the user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();
        
        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();
        
        // Set the properties
        triangle.setColor(color);
        triangle.setFilled(filled);
        
        // Display the triangle information
        System.out.println("\nTriangle Information:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println(triangle.toString());
        
        input.close();
    }
}

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

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
  
    /**Default construct*/
    protected GeometricObject() {
    }
  
    /**Construct a geometric object*/
    protected GeometricObject(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
    }
  
    /**Getter method for color*/
    public String getColor() {
      return color;
    }
  
    /**Setter method for color*/
    public void setColor(String color) {
      this.color = color;
    }
  
    /**Getter method for filled. Since filled is boolean,
       so, the get method name is isFilled*/
    public boolean isFilled() {
      return filled;
    }
  
    /**Setter method for filled*/
    public void setFilled(boolean filled) {
      this.filled = filled;
    }
  
    /**Abstract method findArea*/
    public abstract double getArea();
  
    /**Abstract method getPerimeter*/
    public abstract double getPerimeter();
  }
  