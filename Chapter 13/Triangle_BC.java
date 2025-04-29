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