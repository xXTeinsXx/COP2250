/* StudentGradeCalculator
 * program that determines student grades relative to the highest score, calculating letter grades by comparing each student's score to specified ranges below the best score.
 * BryanCaban_07_5_1
 * 
 */

import java.util.Scanner;

public class BryanCaban_07_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];
        int bestScore = 0;

        // Prompt for student scores
        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i]; // Find the best score
            }
        }

        // Display grades
        for (int i = 0; i < numStudents; i++) {
            char grade;
            if (scores[i] >= bestScore - 10) {
                grade = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grade = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grade = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
        
        input.close();
    }
}
