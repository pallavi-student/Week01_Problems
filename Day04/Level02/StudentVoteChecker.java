import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Return true if age is 18 or above, else false
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10]; // Array to store ages of 10 students

        // Input ages for the students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Age of student " + i + 1 + ": ");
            ages[i] = input.nextInt();
        }

        // Check student can vote
        System.out.println("Voting Eligibility:");
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + i + 1 + " with Age " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + i + 1 + " with Age " + ages[i] + ") cannot vote.");
            }
        }
    }
}
