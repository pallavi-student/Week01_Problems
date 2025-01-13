
import java.util.Scanner;

public class StudentGradesCalculator2 {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        // 2D array to store marks [rows for students, columns for subjects]
        int[][] marks = new int[numOfStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[numOfStudents]; // To store percentages
        char[] grades = new char[numOfStudents]; // To store grades

        // Loop to take input for each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            // Input validation for Physics, Chemistry, Maths
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                 System.out.print("Enter " + subject + " marks (0-100): ");
                    int marksInput = scanner.nextInt();
                    if (marksInput >= 0 && marksInput <= 100) {
                        marks[i][j] = marksInput;
                        } else {
                        System.out.println("Invalid marks Please enter a value between 0 and 100.");
                    
                }
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nResults:");
System.out.println("Student"+" "+"Physics"+" "+"Chemistry"+"Maths"+" "+"Percentage"+"Grade"); for (int i = 0; i < numOfStudents; i++) { System.out.println((i + 1) + " " + physicsMarks[i] + " " + chemistryMarks[i] + " " + mathsMarks[i] + " " + percentages[i]) + "%" + " " + grades[i]); }
scanner.close(); // Close scanner
}


            }
}

