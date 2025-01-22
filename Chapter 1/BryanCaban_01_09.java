/* 
Bryan Caban - 14.01.2025
Chapter 1: Assignment 1.9
Write a program that displays the area and perimeter of a rectangle
*/ 

public class BryanCaban_01_09 {

    public static void main(String[] args) {
        // Welcome the user to the program
        System.out.println("Rectangle Area and Perimeter Calculator");
             
        // Say what the width and height are for the rectangle
        double width = 4.5;
        double height = 7.9;

        // Calculate the area
        double area = width * height;

        // Calculate what the perimeter is
        double perimeter = 2 * (width + height);

        // Display the results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }


}

// Code written on 14.01.2025 by Bry
