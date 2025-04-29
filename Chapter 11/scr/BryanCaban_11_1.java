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