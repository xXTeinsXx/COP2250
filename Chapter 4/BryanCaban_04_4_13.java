/* 
Bryan Caban
Chapter 4: Assignment 4.13
Write a program that plays rock-paper-scissor game
*/ 

import java.util.Scanner;

public class BryanCaban_04_4_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String str = input.next();

        if (str.length() != 1 || !Character.isLetter(str.charAt(0))) {
            System.out.println(str + " is an invalid input");
            return; // Exit the program if input is invalid
        }

        char ch = Character.toLowerCase(str.charAt(0)); // Convert to lowercase for easier checking

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(str + " is a vowel");
        } else {
            System.out.println(str + " is a consonant");
        }
        input.close(); // Close the scanner to release resources
    }
}