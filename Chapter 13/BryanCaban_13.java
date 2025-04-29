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