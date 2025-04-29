// Test class
public class BryanCaban_09_9_1 {
    public static void main(String[] args) {
        // Create two Rectangle objects with specified dimensions
        Rectangle_JM rectangle1 = new Rectangle_JM(4, 40);
        Rectangle_JM rectangle2 = new Rectangle_JM(3.5, 35.9);
        
        // Display the properties of rectangle1
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        
        // Display the properties of rectangle2
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}

// Rectangle class
class Rectangle_JM {
    // Data fields
    double width;
    double height;
    
    // No-arg constructor creates a default rectangle
    Rectangle_JM() {
        width = 1;
        height = 1;
    }
    
    // Constructor with specified width and height
    Rectangle_JM(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    // Return the area of this rectangle
    double getArea() {
        return width * height;
    }
    
    // Return the perimeter of this rectangle
    double getPerimeter() {
        return 2 * (width + height);
    }
}