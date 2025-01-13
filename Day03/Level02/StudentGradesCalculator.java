import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numOfStudents];
        int[] chemistryMarks = new int[numOfStudents];
        int[] mathsMarks = new int[numOfStudents];
        double[] percentages = new double[numOfStudents];
        char[] grades = new char[numOfStudents];

        // Loop to take input for each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            // Input for Physics
            while (true) {
                System.out.print("Enter Physics marks (0-100): ");
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    physicsMarks[i] = marks;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            }

            // Input for Chemistry
            while (true) {
                System.out.print("Enter Chemistry marks (0-100): ");
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    chemistryMarks[i] = marks;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            }

            // Input for Maths
            while (true) {
                System.out.print("Enter Maths marks (0-100): ");
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    mathsMarks[i] = marks;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            }

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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
        System.out.println("Student”+”  “+”Physics”+”  “+”Chemistry”+”Maths”+”  “+”Percentage”+”Grade"); for (int i = 0; i < numOfStudents; i++) { System.out.println((i + 1) + "  " + physicsMarks[i] + "  " + chemistryMarks[i] + "    " + mathsMarks[i] + "  " + percentages[i]) + "%" + "    " + grades[i]); }

        scanner.close(); // Close scanner
    }
}
