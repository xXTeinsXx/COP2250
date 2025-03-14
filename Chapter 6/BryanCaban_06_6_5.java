/* ThreeNumberSorter
 * Takes three numbers as input, sorts them in ascending order, and displays the result using a dedicated method.
 * BryanCaban_06_6_5 
 */

import java.util.Scanner;

public class BryanCaban_06_6_5 {

    // Method to display numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Create a copy of input numbers to preserve original values
        double first = num1;
        double second = num2;
        double third = num3;
        
        // Sorting using simple swapping
        if (first > second) {
            double temp = first;
            first = second;
            second = temp;
        }
        if (second > third) {
            double temp = second;
            second = third;
            third = temp;
        }
        if (first > second) {
            double temp = first;
            first = second;
            second = temp;
        }

        // Display sorted numbers with formatted output
        System.out.printf("Numbers in increasing order: %.2f, %.2f, %.2f%n", 
                         first, second, third);
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(System.in);

            // Prompt user to enter three numbers
            System.out.print("Enter three numbers: ");
            
            // Check if input is available and is numeric
            if (!input.hasNextDouble()) {
                throw new IllegalArgumentException("Please enter valid numeric values.");
            }
            double num1 = input.nextDouble();
            
            if (!input.hasNextDouble()) {
                throw new IllegalArgumentException("Please enter valid numeric values.");
            }
            double num2 = input.nextDouble();
            
            if (!input.hasNextDouble()) {
                throw new IllegalArgumentException("Please enter valid numeric values.");
            }
            double num3 = input.nextDouble();

            // Call the method to sort and display numbers
            displaySortedNumbers(num1, num2, num3);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner in finally block to ensure it's always closed
            if (input != null) {
                input.close();
            }
        }
    }
}
