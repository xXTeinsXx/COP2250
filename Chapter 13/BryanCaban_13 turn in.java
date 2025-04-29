// Abstract GeometricObject class
abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Construct a default geometric object
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Construct a geometric object with the specified color and filled value
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Return color
    public String getColor() {
        return color;
    }

    // Set a new color
    public void setColor(String color) {
        this.color = color;
    }

    // Return filled (true if filled, false if not filled)
    public boolean isFilled() {
        return filled;
    }

    // Set a new filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Get dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Rectangle class
class Rectangle_BC extends GeometricObject {
    private double width;
    private double height;

    // Default constructor
    public Rectangle_BC() {
        width = 1.0;
        height = 1.0;
    }

    // Constructor with specified width and height
    public Rectangle_BC(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with width, height, color, and filled
    public Rectangle_BC(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Return width
    public double getWidth() {
        return width;
    }

    // Set a new width
    public void setWidth(double width) {
        this.width = width;
    }

    // Return height
    public double getHeight() {
        return height;
    }

    // Set a new height
    public void setHeight(double height) {
        this.height = height;
    }

    // Return area
    @Override
    public double getArea() {
        return width * height;
    }

    // Return perimeter
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Return string representation of the object
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", " + super.toString() + "]";
    }
}

// Circle class
class Circle_BC extends GeometricObject {
    private double radius;

    // Default constructor
    public Circle_BC() {
        radius = 1.0;
    }

    // Constructor with specified radius
    public Circle_BC(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle_BC(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Return area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Return diameter
    public double getDiameter() {
        return 2 * radius;
    }

    // Return perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Return string representation of the object
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", " + super.toString() + "]";
    }
}

// Triangle class
class Triangle_BC extends GeometricObject {
    private double side1, side2, side3;

    // Default constructor
    public Triangle_BC() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    // Constructor with specified sides
    public Triangle_BC(double side1, double side2, double side3) throws IllegalArgumentException {
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Invalid triangle sides: The sum of any two sides must be greater than the third side.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Constructor with sides, color, and filled
    public Triangle_BC(double side1, double side2, double side3, String color, boolean filled) throws IllegalArgumentException {
        super(color, filled);
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Invalid triangle sides: The sum of any two sides must be greater than the third side.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Check if the sides form a valid triangle
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Return side1
    public double getSide1() {
        return side1;
    }

    // Return side2
    public double getSide2() {
        return side2;
    }

    // Return side3
    public double getSide3() {
        return side3;
    }

    // Set sides
    public void setSides(double side1, double side2, double side3) throws IllegalArgumentException {
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Invalid triangle sides: The sum of any two sides must be greater than the third side.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Return area
    @Override
    public double getArea() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Return perimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Return string representation of the object
    @Override
    public String toString() {
        return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", " + super.toString() + "]";
    }
}

// Main test program
public class BryanCaban_13 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create Rectangle object
        System.out.println("Enter rectangle information:");
        Rectangle_BC rectangle = null;
        
        try {
            System.out.print("Enter length: ");
            double length = input.nextDouble();
            System.out.print("Enter width: ");
            double width = input.nextDouble();
            input.nextLine(); // Consume newline
            System.out.print("Enter color: ");
            String rectangleColor = input.nextLine();
            System.out.print("Is it filled (true/false)? ");
            boolean rectangleFilled = input.nextBoolean();
            
            // Create rectangle object
            rectangle = new Rectangle_BC(length, width, rectangleColor, rectangleFilled);
            
        } catch (java.util.InputMismatchException e) {
            // Handle invalid input format
            System.out.println("Error: Invalid input format for rectangle. Using default values.");
            rectangle = new Rectangle_BC();
            input.nextLine(); // Clear the input buffer
        }

        // Create Circle object
        System.out.println("\nEnter circle information:");
        Circle_BC circle = null;
        
        try {
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();
            input.nextLine(); // Consume newline
            System.out.print("Enter color: ");
            String circleColor = input.nextLine();
            System.out.print("Is it filled (true/false)? ");
            boolean circleFilled = input.nextBoolean();
            
            // Create circle object
            circle = new Circle_BC(radius, circleColor, circleFilled);
            
        } catch (java.util.InputMismatchException e) {
            // Handle invalid input format
            System.out.println("Error: Invalid input format for circle. Using default values.");
            circle = new Circle_BC();
            input.nextLine(); // Clear the input buffer
        }

        // Create Triangle object
        System.out.println("\nEnter triangle information:");
        Triangle_BC triangle = null;
        
        try {
            System.out.print("Enter side 1: ");
            double side1 = input.nextDouble();
            System.out.print("Enter side 2: ");
            double side2 = input.nextDouble();
            System.out.print("Enter side 3: ");
            double side3 = input.nextDouble();
            input.nextLine(); // Consume newline
            System.out.print("Enter color: ");
            String triangleColor = input.nextLine();
            System.out.print("Is it filled (true/false)? ");
            boolean triangleFilled = input.nextBoolean();
            
            // Create triangle object (may throw IllegalArgumentException if not a valid triangle)
            triangle = new Triangle_BC(side1, side2, side3, triangleColor, triangleFilled);
            
        } catch (java.util.InputMismatchException e) {
            // Handle invalid input format
            System.out.println("Error: Invalid input format for triangle. Using default values.");
            triangle = new Triangle_BC();
            input.nextLine(); // Clear the input buffer
        } catch (IllegalArgumentException e) {
            // Handle invalid triangle (when sides don't form a valid triangle)
            System.out.println("Error: " + e.getMessage() + " Using default values.");
            triangle = new Triangle_BC();
        }

        // Display information
        System.out.println("\n----- Rectangle Information -----");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        
        System.out.println("\n----- Circle Information -----");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        
        System.out.println("\n----- Triangle Information -----");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        
        // Create geometric objects using the three shapes
        GeometricObject geo1 = rectangle;
        GeometricObject geo2 = circle;
        GeometricObject geo3 = triangle;
        
        // Compare areas
        System.out.println("\n----- Area Comparisons -----");
        System.out.println("Rectangle and Circle have equal areas: " + equalArea(geo1, geo2));
        System.out.println("Rectangle and Triangle have equal areas: " + equalArea(geo1, geo3));
        System.out.println("Circle and Triangle have equal areas: " + equalArea(geo2, geo3));
        
        // Compare perimeters
        System.out.println("\n----- Perimeter Comparisons -----");
        System.out.println("Rectangle and Circle have equal perimeters: " + equalPerimeter(geo1, geo2));
        System.out.println("Rectangle and Triangle have equal perimeters: " + equalPerimeter(geo1, geo3));
        System.out.println("Circle and Triangle have equal perimeters: " + equalPerimeter(geo2, geo3));
        
        input.close();
    }
    
    // Method to compare the areas of two geometric objects
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return Math.abs(object1.getArea() - object2.getArea()) < 0.000001;
    }
    
    // Method to compare the perimeters of two geometric objects
    public static boolean equalPerimeter(GeometricObject object1, GeometricObject object2) {
        return Math.abs(object1.getPerimeter() - object2.getPerimeter()) < 0.000001;
    }
}