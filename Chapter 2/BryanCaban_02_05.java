/* 
Bryan Caban - 23.01.2025
Chapter 2: Assignment 2.5
Write a program that prompts the user for a subtotal and gratuity rate
*/ 

import java.util.Scanner;
import java.text.DecimalFormat;

public class GratuityCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Create DecimalFormat object for currency formatting
        DecimalFormat currencyFormat = new DecimalFormat("$#,##0.00");
        
        // Prompt user for subtotal
        System.out.print("Enter the subtotal: $");
        double subtotal = input.nextDouble();
        
        // Prompt user for gratuity rate
        System.out.print("Enter the gratuity rate (%): ");
        double gratuityRate = input.nextDouble();
        
        // Calculate gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        
        // Display results
        System.out.println("Gratuity: " + currencyFormat.format(gratuity));
        System.out.println("Total: " + currencyFormat.format(total));
        
        // Close scanner
        input.close();
    }
}
