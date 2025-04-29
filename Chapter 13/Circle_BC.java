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