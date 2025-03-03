/* 
Bryan Caban - 30.01.2025
Chapter 3: Assignment 3.17
Write a program that plays rock-paper-scissor game
*/ 

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Create Random object for computer's choice
        Random rand = new Random();
        
        // Generate computer's choice (0 = scissor, 1 = rock, 2 = paper)
        int computer = rand.nextInt(3);
        
        // Prompt user for their choice
        System.out.print("Enter your choice (0 = scissor, 1 = rock, 2 = paper): ");
        int user = input.nextInt();
        
        // Input validation
        if (user < 0 || user > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
            return;
        }
        
        // Display computer's choice
        System.out.print("Computer chose ");
        switch (computer) {
            case 0:
                System.out.println("scissor");
                break;
            case 1:
                System.out.println("rock");
                break;
            case 2:
                System.out.println("paper");
                break;
        }
        
        // Display user's choice
        System.out.print("You chose ");
        switch (user) {
            case 0:
                System.out.println("scissor");
                break;
            case 1:
                System.out.println("rock");
                break;
            case 2:
                System.out.println("paper");
                break;
        }
        
        // Determine and display game result
        if (computer == user) {
            System.out.println("It's a draw!");
        } else {
            // Determine if user wins
            boolean userWins = (user == 0 && computer == 2) ||    // Scissor cuts paper
                             (user == 1 && computer == 0) ||    // Rock crushes scissor
                             (user == 2 && computer == 1);      // Paper wraps rock
                             
            if (userWins) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        
        // Close the Scanner
        input.close();
    }
}