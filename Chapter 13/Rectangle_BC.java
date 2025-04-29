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