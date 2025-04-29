import java.util.Random;
import java.util.Scanner;

public class BryanCaban_12_12_3 {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] numbers = new int[100];
        Random random = new Random();
        
        // Fill the array with random integers (between 1 and 1000)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000) + 1;
        }
        
        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an index
        System.out.print("Enter an index (Number) (0-99): ");
        int index = input.nextInt();
        
        // Try to access the array at the specified index
        try {
            // Display the element value at the specified index
            System.out.println("Element at index " + index + " is " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Display "Out of Bounds" if the index is out of bounds
            System.out.println("Out of Bounds");
        }
        
        // Close the scanner
        input.close();
    }
}